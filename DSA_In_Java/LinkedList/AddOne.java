public class AddOne {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    public AddOne() {
        this.head = null;
    }
    
    Node ReverseNode(Node head) {
        Node curr = head;
        Node nex = null;
        Node prev = null;
        while (curr != null) {
            nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        return prev;
    }

    public Node addingNode(Node head){
        head = ReverseNode(head);
        Node curr=head;

        while (curr!=null) {
            if(curr.next==null && curr.data==9){
                curr.data=1;
                Node temp = new Node(0);
                temp.next = head;
                head=temp;
                curr= curr.next;
            }
            else if(curr.data==9){
                curr.data=0;
                curr=curr.next;
            }
            else{
                curr.data = curr.data+1;
                curr =curr.next;
                break;
            }
        }
        head = ReverseNode(head);
        return head;
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
        AddOne addOne = new AddOne();

        Node head1 = new Node(4);
        head1.next = new Node(5);
        head1.next.next = new Node(6);

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(9);

        Node head3 = new Node(9);
        head3.next = new Node(9);
        head3.next.next = new Node(9);

        System.out.println("LinkedList 1  after adding One: ");
        Node sol1 = addOne.addingNode(head1);
        addOne.display(sol1);

        System.out.println("LinkedList 2  after adding One: ");
        Node sol2 = addOne.addingNode(head2);
        addOne.display(sol2);

        System.out.println("LinkedList 3  after adding One: ");
        Node sol3 = addOne.addingNode(head3);
        addOne.display(sol3);

        
    }
}
