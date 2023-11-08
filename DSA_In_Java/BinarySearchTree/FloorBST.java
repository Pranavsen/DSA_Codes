public class FloorBST {
    private static class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int Floor(Node root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.data == key) {
                floor = root.data;
                return floor;
            } else if (root.data < key) {
                floor = root.data;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(11);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);

        int key = 9;
        int ans = Floor(root, key);
        System.out.println("Floor value is : " + ans);

    }
}
