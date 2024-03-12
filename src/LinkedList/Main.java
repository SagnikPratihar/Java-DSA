package LinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insertFirst(3);
//        list.insertFirst(8);
//        list.insertFirst(85);
//        list.insertFirst(14);
//        list.insertLast(99);
//        list.insert(100,3);
//        list.display();
//        list.insertRec(88,2);
//        list.display();
//        System.out.println( "Deleted element is : " +list.deleteFirst());
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(3);
//        list.display();
//        System.out.println(list.find(85));

//        DoublyLinkedList list=new DoublyLinkedList();
//        list.insertFirst(55);
//        list.insertFirst(8);
//        list.insertFirst(25);
//        list.insertFirst(9);
//        list.display();

//        CircularLinkedList list=new CircularLinkedList();
//        list.insert(45);
//        list.insert(98);
//        list.insert(7);
//        list.display();

//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(4);
//        list.insertLast(4);
//        list.display();
//        list.duplicates();
//        list.display();

        SinglyLinkedList first = new SinglyLinkedList();
        SinglyLinkedList second = new SinglyLinkedList();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
//        first.display();
//        second.display();

        SinglyLinkedList ans = SinglyLinkedList.merge(first, second);
        ans.display();
    }
}
