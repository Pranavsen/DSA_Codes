import java.util.Scanner;

public class LCAofBST {
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

    public static Node LCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (n1 < root.data && n2 < root.data) {
            root = root.left;
        }
        if (n1 > root.data && n2 > root.data) {
            root = root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node ans = LCA(root, n1, n2);
        System.out.println("LCA is : " + ans.data);

        sc.close();
    }
}
