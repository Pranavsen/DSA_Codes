package CircularLL;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }

    public void addAtBegin(int data) {
        Node newNode = new Node(data);
        Node ptr = head;
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            while (ptr.next != head) {
                ptr = ptr.next;
            }
            ptr.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node last = head;
            do {
                last = last.next;
            } while (last.next != head);

            last.next = newNode;
            newNode.next = head;
        }
    }

    public void addAtSpecificPosition(int data, int position) {
        Node newNode = new Node(data);
        Node ptr = head;
        if (position == 0) {
            if (head == null) {
                head = newNode;
                head.next = head;
            } else {
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = newNode;
                newNode.next = head;
                head = newNode;
            }
        } else {
            for (int i = 0; i < position - 1; i++) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
    }

    public int deleteAtBegin() {
        Node ptr = head;
        int data = -1;
        if (head == null) {
            throw new NoSuchElementException("List is empty.\n");
        } else {
            while (ptr.next != head) {
                ptr = ptr.next;
            }
             if (ptr == head) {
                data = head.data;
                head = null;
                throw new NoSuchElementException("List is empty.\n");
            }
            else{
                data = head.data;
                head = head.next;
                ptr.next = head;
            }
        }
        return data;
    }

    public int deleteAtEnd() {
        Node curr = head;
        Node ptr = null;
        int data = -1;
        if (head == null) {
            throw new NoSuchElementException("List is empty.\n");
        } else {
            while (curr.next != head) {
                ptr = curr;
                curr = curr.next;
            }
            data = curr.data;
            ptr.next = curr.next;
        }
        return data;
    }

    public int deleteAtSpecificPosition(int position){
        Node curr = head;
        Node ptr=null;
        int data =-1;
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else if(position ==1){
            while (curr.next != head) {
                curr = curr.next;
            }
             if (curr == head) {
                data = head.data;
                head = null;
                throw new NoSuchElementException("List is empty.\n");
            }
            else{
                data = head.data;
                head = head.next;
                curr.next = head;
            }
        }
        else{
            for(int i=0;i<position-1;i++){
                ptr = curr;
                curr = curr.next;
            }
            data = curr.data;
            ptr.next = curr.next;
        }
        return data;
    }

    public void display() {
        Node ptr = head;
        System.out.print("Linkedlist : ");
        do {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        } while (ptr != head);
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node ptr = head;
        do {
            count++;
            ptr = ptr.next;
        } while (ptr != head);
        return count;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

}
