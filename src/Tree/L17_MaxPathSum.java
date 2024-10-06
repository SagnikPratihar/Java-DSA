package Tree;

public class L17_MaxPathSum {
    public static int maxPathSum(Node root) {
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxi);
        return maxi[0];
    }

    public static int maxPathDown(Node root, int[] maxi) {
        if (root == null) return 0;
        int leftSum = Math.max(0, maxPathDown(root.left, maxi));
        int rightSum = Math.max(0, maxPathDown(root.right, maxi));
        maxi[0] = Math.max(maxi[0], leftSum + rightSum + root.data);
        return root.data + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Maximum path sum : " + maxPathSum(root));
    }
}
