package Tree;
import java.util.*;
public class ZigZagTraversal {

        public static List<List<Integer>> zigzagLevelOrder(Node root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            boolean reverseLevel = false;

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> levelList = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    Node node = queue.poll();
                    if (reverseLevel) {
                        levelList.add(0, node.data); // Adding at the beginning for reverse level
                    } else {
                        levelList.add(node.data); // Adding at the end for normal level
                    }

                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                result.add(levelList);
                reverseLevel = !reverseLevel; // Toggle the direction for next level
            }
            return result;
        }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);


        List<List<Integer>> zigzagTraversal = zigzagLevelOrder(root);

        System.out.println("Zigzag Traversal:");
        for (List<Integer> level : zigzagTraversal) {
            System.out.println(level);
        }
    }
}
