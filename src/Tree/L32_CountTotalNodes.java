package Tree;

public class L32_CountTotalNodes {
    public static int countNodes(Node root) {
        if (root == null) return 0;
        int left = getHeightLeft(root);
        int right = getHeightRight(root);
        //If left and right is equal it means that the tree is complete
        if (left == right) return ((2 << (left)) - 1); //2<<left == Math.pow(2,left)
        //else recursively calculate the number of nodes in left and right
        else return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static int getHeightLeft(Node root) {
        int count = 0;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;
    }

    public static int getHeightRight(Node root) {
        int count = 0;
        while (root.right != null) {
            count++;
            root = root.right;
        }
        return count;
    }
}
