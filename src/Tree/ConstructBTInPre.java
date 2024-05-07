package Tree;

import java.util.*;

public class ConstructBTInPre {
    public static Node buildTree(int[] preOrder, int[] inOrder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inMap.put(inOrder[i], i);
        }
        Node root = buildTree(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1, inMap);
        return root;
    }

    public static Node buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;
        Node root = new Node(preOrder[preStart]);
        int inRoot = inMap.get(root.data);
        int numsLeft = inRoot - inStart;
        root.left = buildTree(preOrder, preStart + 1, preStart + numsLeft, inOrder, inStart, inRoot - 1, inMap);
        root.right = buildTree(preOrder, preStart + numsLeft + 1, preEnd, inOrder, inRoot + 1, inEnd, inMap);
        return root;
    }
}
