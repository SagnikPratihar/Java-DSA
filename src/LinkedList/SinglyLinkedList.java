package LinkedList;



public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }
    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=head;
       for (int i = 1; i < index; i++) {
         temp=temp.next;
       }
       Node node=new Node(val,temp.next);
       temp.next=node;
      size++;
    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public int deleteFirst(){
        int val =head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
           size--;
        return val;
    }

    public int deleteLast(){
       if(size<=1){
           return deleteFirst();
       }
       Node secondLast=get(size-2);
       int val= tail.value;
       tail=secondLast;
       tail.next=null;
       return val;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node pre=get(index-1);
        int val=pre.next.value;
        pre.next=pre.next.next;
        return  val;

    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }





    //Remove duplicate from sorted list
    public void duplicates() {
        Node node = head;

        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    //Merge two sorted list
    public static SinglyLinkedList merge(SinglyLinkedList first, SinglyLinkedList second) {
        Node f = first.head;
        Node s = second.head;

        SinglyLinkedList ans = new SinglyLinkedList();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }



    //Linked List cycle
    //Amazon , Microsoft
    public boolean hasCycle(){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }



    //Length of LinkedList cycle
    public int cycleLength() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }



    //Linked List cycle 2
    public Node detectCycle() {
        int length = 0;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = cycleLength();
                break;
            }
        }
        if (length == 0){
            return null;
        }
        //finding the start
        Node f = head;
        Node s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }
        //now move both pointer forward and they will meet at the start
        while (f != s) {
            s = s.next;
            f = f.next;
        }
        return s;
    }


    //Happy Number
    //Google
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            ans += ((num % 10) * (num % 10));
            num /= 10;
        }
        return ans;
    }



    //Middle of the LinkedList
    public Node middle() {
        Node s = head;
        Node f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }



    //Reverse LinkedList (Recursive)
    public void reverseRec(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //In place reversal of LinkedList
    //Google, Microsoft, Amazon, Apple
    public Node reverse() {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node pres = head;
        Node next = pres.next;
        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }


    //Reverse a part of a LinkedList
/*    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
    
 */



    //Palindrome LinkedList
    //Google, Microsoft, LinkedIn, Apple, Facebook, Amazon
/*    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        // compare both the halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }

 */




    //Reorder List
    //Google, Facebook
 /*   public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hs = reverseList(mid);
        ListNode hf = head;

        // rearrange
        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        // next of tail to null
        if (hf != null) {
            hf.next = null;
        }
    }

  */
}
