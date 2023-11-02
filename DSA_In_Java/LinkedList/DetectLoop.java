public class DetectLoop {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node head;

    public DetectLoop() {
        this.head = null;
    }

    public void DetectandRemove(Node head) {
        if (head == null || head.next == null)
            return;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow != fast)
            return;

        if (slow == head) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        } else {
            slow = head;
            while (fast.next != slow.next) {
                fast = fast.next;
                slow = slow.next;

            }
            fast.next = null;
        }
        return;
    }

    /*
     * Node startingPointOfLoop(Node head) {
     * if (head == null || head.next == null)
     * return null;
     * Node slow = head;
     * Node fast = head;
     * Node entry = head;
     * while (fast.next != null && fast.next.next != null) {
     * slow = slow.next;
     * fast = fast.next.next;
     * if (slow == fast) {
     * while (slow != entry) {
     * slow = slow.next;
     * entry = entry.next;
     * }
     * return slow;
     * }
     * }
     * return null;
     * }
     */

    public void display(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DetectLoop detectLoop = new DetectLoop();
        detectLoop.head = new Node(2);
        detectLoop.head.next = new Node(4);
        detectLoop.head.next.next = new Node(6);
        detectLoop.head.next.next.next = new Node(8);
        detectLoop.head.next.next.next.next = new Node(10);
        detectLoop.head.next.next.next.next.next = new Node(12);
        detectLoop.head.next.next.next.next.next.next = new Node(14);
        detectLoop.head.next.next.next.next.next.next.next = head.next;

        detectLoop.DetectandRemove(head);
        detectLoop.display(head);
    }
}
