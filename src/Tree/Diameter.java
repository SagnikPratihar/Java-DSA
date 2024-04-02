package Tree;

public class Diameter {
    public static int diameterOfBinaryTree(Node root) {
        int[] diameter = new int[1];
        /*  Here we use array because : In Java, primitive types (like int) are passed by value,
         which means when you pass an int to a method, a copy of the value is made and passed
         to the method. Changes made to the value inside the method do not affect the original
         value outside the method.
         https://chat.openai.com/share/fb1595c9-5be8-4171-85d1-9bd11e3b1d4c
         */
        depth(root, diameter);
        return diameter[0];
    }

    public static int depth(Node root, int[] diameter) {
        if (root == null) return 0;
        int lh = depth(root.left, diameter);
        int rh = depth(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left=new Node(4);
        root.right.left.left=new Node(5);
        root.right.left.left.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(8);
        root.right.right.right.right=new Node(9);


        System.out.println("The depth of the binary tree is : " +diameterOfBinaryTree(root));
    }
}
