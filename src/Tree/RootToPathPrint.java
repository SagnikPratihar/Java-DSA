package Tree;

import java.util.ArrayList;
import java.util.List;

public class RootToPathPrint {
    public static List<Integer> rootTOPath(Node root, int x) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return null;
        path(root, ans, x);
        return ans;
    }

    public static boolean path(Node root, List<Integer> ans, int x) {
        if (root == null) return false;
        ans.add(root.data);
        if (root.data == x) return true;
        if (path(root.left, ans, x) || path(root.right, ans, x)) {
            return true;
        }
        ans.remove(ans.size() - 1);
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(rootTOPath(root,6));
    }
}