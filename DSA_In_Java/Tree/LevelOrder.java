import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class LevelOrder {
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

    public static Vector<Integer> levelorder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        Vector<Integer> list = new Vector<Integer>();
        if (root == null)
            return list;
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);

            list.add(temp.data);

        }
        return list;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.left.right.right = new Node(8);

      Vector<Integer>ans= levelorder(root);
      for (Integer integer : ans) {
        System.out.print(integer+" ");
      }

    }
}
