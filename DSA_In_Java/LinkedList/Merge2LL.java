// T.C. => O(n+m)
// S.C. => O(1)

public class Merge2LL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head1;    
    Node head2;


    public Merge2LL() {
        this.head1 = null;        
        this.head2 = null;

    }

   public Node merge(Node head1, Node head2){

    if(head1==null) return head2;
    if(head2==null) return head1;
    if(head1.data>head2.data){
        Node temp = head1;
        head1=head2;
        head2=temp;
    }
    Node res = head1;
    while (head1!=null && head2!=null) {
        Node tmp = null;
        while (head1!=null && head1.data<=head2.data) {
            tmp = head1;
            head1=head1.next;
        }
        tmp.next=head2;

        //swap
        Node temp = head1;
        head1=head2;
        head2=temp;
    }
return res;
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
        Merge2LL merge2ll = new Merge2LL();
        merge2ll.head1 = new Node(5);
        merge2ll.head1.next = new Node(7);
        merge2ll.head1.next.next = new Node(9);

        merge2ll.head2= new Node(3);
        merge2ll.head2.next = new Node(4);
        merge2ll.head2.next.next = new Node(8);
        merge2ll.head2.next.next.next = new Node(10);

        System.out.println("LinkedList 1 : ");
        merge2ll.display(merge2ll.head1);
        System.out.println("LinkedList 2 : ");
        merge2ll.display(merge2ll.head2);
        System.out.println("\nAfter Merged : ");
        Node ans = merge2ll.merge(merge2ll.head1,merge2ll.head2);
        merge2ll.display(ans);
    }
}
