package Tree;

import java.util.*;

public class MorrisTraversal {

    public static List<Integer> morrisTraversal(Node root) {
        List<Integer> inOrder = new ArrayList<>();
        Node cur = root;
        while (cur != null) {
            if (cur.left == null) {
                inOrder.add(cur.data);
                cur = cur.right;
            } 
            else {
                // If the left child is not NULL,
                // find the predecessor (rightmost node
                // in the left subtree)
                Node prev = cur.left;
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                // If the predecessor's right child
                // is NULL, establish a temporary link
                // and move to the left child
                if (prev.right == null) {
                    prev.right = cur;
                    cur = cur.left;
                } else {
                    // If the predecessor's right child
                    // is already linked, remove the link,
                    // add current node to inorder list,
                    // and move to the right child
                    prev.right = null;
                    inOrder.add(cur.data);
                    cur = cur.right;
                }
            }
        }
        return inOrder;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.right = new Node(3);
        System.out.println(morrisTraversal(root));
    }
}
