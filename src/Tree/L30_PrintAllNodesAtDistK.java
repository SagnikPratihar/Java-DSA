package Tree;

import java.util.*;

public class L30_PrintAllNodesAtDistK {
    private static void markParents(Node root, Map<Node, Node> parent_track, Node target) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.left != null) {
                parent_track.put(current.left, current);
                queue.offer(current.left);
            }
            if (current.right != null) {
                parent_track.put(current.right, current);
                queue.offer(current.right);
            }
        }
    }

    public static List<Integer> distanceK(Node root, Node target, int k) {
        Map<Node, Node> parent_track = new HashMap<>();
        markParents(root, parent_track, root);
        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(target);
        visited.put(target, true);
        int curr_level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (curr_level == k) break;
            curr_level++;
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.left != null && visited.get(current.left) == null) {
                    queue.offer(current.left);
                    visited.put(current.left, true);
                }
                if (current.right != null && visited.get(current.right) == null) {
                    queue.offer(current.right);
                    visited.put(current.right, true);
                }
                if (parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {
                    queue.offer(parent_track.get(current));
                    visited.put(parent_track.get(current), true);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            result.add(current.data);
        }
        return result;
    }

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(5);
        root.left.left=new Node(6);
        root.left.right=new Node(2);
        root.left.right.left=new Node(7);
        root.left.right.right=new Node(4);
        root.right=new Node(1);
        root.right.left=new Node(0);
        root.right.right=new Node(8);

        System.out.println(distanceK(root,root.left,2));
    }
}
