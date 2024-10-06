package Tree;

public class L18_IdenticalORNot {
    public static boolean identical(Node p, Node q) {
        if (p == null || q == null)
            return (p == q);
        return (p.data == q.data) && identical(p.left, q.left) && identical(p.right, q.right);
    }

    public static void main(String[] args) {
        Node p = new Node(1);
        p.left = new Node(2);
        p.right = new Node(3);
        p.left.left = new Node(4);
        p.left.right = new Node(5);
        Node q = new Node(1);
        q.left = new Node(2);
        q.right = new Node(5);
        q.left.left = new Node(4);
        q.left.right = new Node(5);

        System.out.println("Two trees are identical : " + identical(p, q));
    }
}
