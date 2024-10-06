package Tree;

public class L27_LowestCommonAncestor {
    public static Node lCA(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        Node left = lCA(root.left, p, q);
        Node right = lCA(root.right, p, q);
        if (left == null) return right;
        else if (right == null) return left;
        else return root; //both left and right are not null, we find our ans
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
        root.right.left = new Node(9);
        root.right.right = new Node(9);

        System.out.println(lCA(root, root.left.left, root.left.right.right));

    }
}
