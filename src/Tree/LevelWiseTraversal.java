package Tree;

import java.util.*;

public class LevelWiseTraversal  {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if (root == null) return wrapList;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
}
