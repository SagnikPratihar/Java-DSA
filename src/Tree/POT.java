package Tree;

import java.util.*;
 class Node {
    int data;
    Node  left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class POT {
    //Recursive Method
      public static void preOrderTrav(Node c, ArrayList<Integer> preOrder) {
        if (c == null) return;
        preOrder.add(c.data);
        preOrderTrav(c.left, preOrder);
        preOrderTrav(c.right, preOrder);
    }



    //Iterative method
    static ArrayList < Integer > preOrderTravIterative(Node curr) {
        ArrayList < Integer > preOrder = new ArrayList<>();
        if (curr == null)
            return preOrder;

        Stack < Node > s = new Stack < > ();
        s.push(curr);

        while (!s.isEmpty()) {
            Node topNode = s.peek();
            preOrder.add(topNode.data);
            s.pop();
            if (topNode.right != null)
                s.push(topNode.right);
            if (topNode.left != null)
                s.push(topNode.left);
        }
        return preOrder;

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

        ArrayList<Integer> preOrder = new ArrayList<>();
        preOrderTrav(root, preOrder);
//        preOrder=preOrderTravIterative(root);


        System.out.print("The preOrder Traversal is : ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " ");
        }

    }
}
