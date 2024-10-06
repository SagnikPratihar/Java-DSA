package Tree;

public class InsertNodeBST {
    public static Node insertNode(Node root, int val) {
        if (root == null) return new Node(val);
        Node cur = root;
        while (true) {
            if (cur.data <= val) {
                if (cur.right != null) cur = cur.right;
                else {
                    cur.right = new Node(val);
                    break;
                }
            } else {
                if (cur.left != null) cur = cur.left;
                else {
                    cur.left = new Node(val);
                    break;
                }
            }
        }
        return root;
    }
}
