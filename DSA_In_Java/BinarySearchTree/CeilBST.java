
public class CeilBST {
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

    public static int Ceil(Node root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.data == key) {
                ceil = root.data;
                return ceil;
            } else if (root.data < key) {
                root = root.right;
            } else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(11);
        root.left.left = new Node(2);
        root.left.right = new Node(6);
        root.right.left = new Node(10);

        int key = 5;
        int ans = Ceil(root, key);
        System.out.println("Ceil value is : " + ans);

    }
}
