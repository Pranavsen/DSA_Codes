public class ReverseKGroup {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public ReverseKGroup() {
        this.head = null;
    }

    public int length(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }


    public Node reverseNodes(Node head,int k ,int length){
        if(head==null || head.next==null) return head;
        if(length<k) return head;
        int count=0;
        Node prev=null;
        Node curr=head;
        Node nex=head;
        while (curr!=null && count<k) {
             nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            count++;
        }
        if (nex!=null) {
            head.next =  reverseK(nex, k);
        }
        return prev;
    }

    public Node reverseK(Node head,int k){
        int l = length(head);
        return reverseNodes(head, k,l);
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
        ReverseKGroup reverseKGroup = new ReverseKGroup();

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);

        int k = 3;
        Node ans =reverseKGroup.reverseK(head1, k);
        reverseKGroup.display(ans);

    }
}
