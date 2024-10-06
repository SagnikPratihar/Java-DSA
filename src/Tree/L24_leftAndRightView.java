package Tree;

import java.util.ArrayList;
import java.util.List;

public class L24_leftAndRightView {
    public static List<Integer> leftViewR(Node root) {
        List<Integer> ans = new ArrayList<>();
        leftView(root, ans, 0);
        return ans;
    }

    public static void leftView(Node root, List<Integer> ans, int level) {
        if (root == null) return;
        if (level == ans.size()) {
            ans.add(root.data);
        }
        leftView(root.right, ans, level + 1);
        leftView(root.left, ans, level + 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(leftViewR(root));
    }
}
