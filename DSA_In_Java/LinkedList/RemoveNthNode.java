public class RemoveNthNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head1;

    public RemoveNthNode() {
        this.head1 = null;
    }

    public Node RemoveNthFromEnd(Node head1,int n){
        Node start = new Node(0);
        start.next = head1;
        Node fast = start;
        Node slow = start;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
  

    public void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveNthNode removeNthNode = new RemoveNthNode();
        removeNthNode.head1 = new Node(2);
        removeNthNode.head1.next = new Node(4);
        removeNthNode.head1.next.next = new Node(6);
        removeNthNode.head1.next.next.next= new Node(8);
        removeNthNode.head1.next.next.next.next = new Node(10);
        removeNthNode.head1.next.next.next.next.next = new Node(12);

        System.out.println("Before Deletion : ");
        removeNthNode.display(removeNthNode.head1);
        
        System.out.println("\nAfter Deletion : ");
        int n = 3;
        Node ans = removeNthNode.RemoveNthFromEnd(removeNthNode.head1,n);
        removeNthNode.display(ans);
    }
}
