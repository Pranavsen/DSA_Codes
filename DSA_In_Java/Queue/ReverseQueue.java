import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> q;

    static void reversequeue() {
        Stack<Integer> stk = new Stack<>();
        while (!q.isEmpty()) {
            stk.push(q.peek());
            q.remove();
        }
        while (!stk.isEmpty()) {
            q.add(stk.peek());
            stk.pop();
        }
    }

    static void display() {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        reversequeue();
        display();
    }

}