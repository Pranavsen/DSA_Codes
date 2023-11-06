public class FindYintersection {
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

    public FindYintersection() {
        this.head1 = null;
        this.head2 = null;

    }

    public Node intersectionPoint(Node head1, Node head2) {

        int length1 = 0;
        int length2 = 0;
        Node ptr1 = head1;
        Node ptr2 = head2;

        while (ptr1 != null) {
            length1++;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            length2++;
            ptr2 = ptr2.next;
        }
        ptr1 = head1;
        ptr2 = head2;
        int diff = Math.abs(length1 - length2);
        if (length1 > length2) {
            for (int i = 0; i < diff; i++) {
                ptr1 = ptr1.next;
            }
        } else if (length1 < length2) {
            for (int i = 0; i < diff; i++) {
                ptr2 = ptr2.next;
            }
        }

        while (ptr1 != null && ptr2 != null) {
            if (ptr1 == ptr2) {
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;

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
        FindYintersection findYintersection = new FindYintersection();

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        // list 2
        Node head2 = new Node(10);
        head2.next = new Node(9);
        head2.next.next = new Node(8);
        head2.next.next.next = head1.next.next.next;

        System.out.println("LinkedList 1 : ");
        findYintersection.display(head1);

        System.out.println("LinkedList 2 : ");
        findYintersection.display(head2);

        System.out.println("\nIntersection Point : ");
        Node ans = findYintersection.intersectionPoint(head1,head2);
        System.out.println(ans.data);
    }
}
