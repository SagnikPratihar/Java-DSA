package Tree;

public class BalanceBTCheck {
    public static boolean checkBalance(Node root) {
        return depth(root) != -1;
    }

    public static int depth(Node root) {
        if (root == null) return 0;
        int l = depth(root.left);
        if (l == -1) return -1;
        int r = depth(root.right);
        if (r == -1) return -1;
        if (Math.abs(l - r) > 1) return -1;
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(checkBalance(root));
    }
}
