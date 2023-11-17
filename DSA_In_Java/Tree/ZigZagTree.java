import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class ZigZagTree {
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

    public static Vector<Vector<Integer>> zigzagLevelOrder(Node root) {

        Vector<Vector<Integer>> ans = new Vector<>();
        Queue<Node> queue = new LinkedList<>();

        if (root == null) {
            return ans;
        }
        queue.add(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            Vector<Integer> temp = new Vector<>();
            int sz = queue.size();
            for (int i = 0; i < sz; i++) {
                Node t = queue.peek();
                temp.add(queue.peek().data);
                queue.remove();
                if (t.left != null)
                    queue.add(t.left);
                if (t.right != null)
                    queue.add(t.right);
            }
            if (flag==false) {
                Collections.reverse(temp);
            }

            ans.add(temp);
            flag = !flag;
        }
        return ans;

    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(7);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(8);
        root.left.left.left = new Node(1);        
        root.left.left.right = new Node(6);        
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(3);
        root.right.left.left = new Node(12);        
        root.right.left.right = new Node(10);        
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(5);



        Vector<Vector<Integer>> ans = zigzagLevelOrder(root);
        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
