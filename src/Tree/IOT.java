package Tree;

import java.util.*;

public class IOT {
    public static void preOrderTrav(Node c, ArrayList<Integer> inOrder) {
        if (c == null) return;
        preOrderTrav(c.left, inOrder);
        inOrder.add(c.data);
        preOrderTrav(c.right, inOrder);
    }
    static ArrayList < Integer > inOrderTravIterative(Node curr) {
        ArrayList < Integer > inOrder = new ArrayList < > ();
        Stack < Node > s = new Stack < > ();
        while (true) {
            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                if (s.isEmpty()) break;
                curr = s.peek();
                inOrder.add(curr.data);
                s.pop();
                curr = curr.right;
            }
        }
        return inOrder;
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

        ArrayList<Integer> inOrder = new ArrayList<>();
        preOrderTrav(root, inOrder);

        System.out.print("The inOrder Traversal is : ");
        for (int i = 0; i < inOrder.size(); i++) {
            System.out.print(inOrder.get(i) + " ");
        }

    }
}
