package Tree;

public class Implementation {
    int data;
    Implementation left;
    Implementation right;

    public Implementation(int key) {
        data = key;
    }

    public static void main(String[] args) {
        Implementation root = new Implementation(1);
        root.left = new Implementation(2);
        root.right = new Implementation(3);
        root.right.left = new Implementation(5);
    }
}
