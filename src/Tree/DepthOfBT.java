package Tree;

public class DepthOfBT {
    public static int depth(Node root) {
        if (root == null) return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.right.left.left = new Node(5);

        System.out.println("The depth of the binary tree is : " + depth(root));
    }
}
