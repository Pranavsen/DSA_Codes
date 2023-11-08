import java.util.Vector;

public class BSTorNot {
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
    public static void inorder(Node root,Vector<Integer> ans){
        if(root==null) return;
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }

    public static boolean BSTcheck(Node root){
        Vector<Integer> ans =new Vector<>();
        inorder(root,ans);
        for (int i = 0; i < ans.size()-1; i++) {
            if(ans.get(i)>=ans.get(i+1)) return false;
        }
        return true;
    }
  

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(3);        
        root.right.left = new Node(5);

        
        boolean ans = BSTcheck(root);
        if(ans) System.out.println("Tree is BST");
        else System.out.println("Tree is Not BST");
    }
}
