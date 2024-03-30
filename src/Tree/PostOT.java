package Tree;

import java.util.*;

public class PostOT {
    public static void preOrderTrav(Node c, ArrayList<Integer> PostOrder) {
        if (c == null) return;
        preOrderTrav(c.left,  PostOrder);
        preOrderTrav(c.right, PostOrder);
        PostOrder.add(c.data);
    }


    //Using 2 stack
    static ArrayList < Integer > postOrderTravIterative1(Node curr) {

        ArrayList < Integer > postOrder = new ArrayList < > ();
        if (curr == null) return postOrder;

        Stack < Node > s1 = new Stack < > ();
        Stack < Node > s2 = new Stack < > ();
        s1.push(curr);
        while (!s1.isEmpty()) {
            curr = s1.peek();
            s1.pop();
            s2.push(curr);
            if (curr.left != null)
                s1.push(curr.left);
            if (curr.right != null)
                s1.push(curr.right);
        }
        while (!s2.isEmpty()) {
            postOrder.add(s2.peek().data);
            s2.pop();
        }
        return postOrder;
    }


    //Using single stack
    static ArrayList < Integer > postOrderTravIterative2(Node curr) {

        ArrayList < Integer > postOrder = new ArrayList < > ();
        if (curr == null) return postOrder;

        Stack < Node > st = new Stack < > ();
        while (curr != null || !st.isEmpty()) {

            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postOrder.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        postOrder.add(temp.data);
                    }
                } else curr = temp;
            }
        }
        return postOrder;


    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList<Integer> PostOrder = new ArrayList<>();
        preOrderTrav(root, PostOrder);

        System.out.print("The postOrder Traversal is : ");
        for (int i = 0; i < PostOrder.size(); i++) {
            System.out.print(PostOrder.get(i) + " ");
        }

    }
}
