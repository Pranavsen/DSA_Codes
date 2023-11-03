import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<Integer>();

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        int ans = -1;
        if (q.isEmpty()) {
            System.out.println("Stsck is empty.\n");
            return ans;
        } else {
            ans = q.remove();
        }
        return ans;
    }

    public int top() {
        return q.peek();
    }

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);

        System.out.println("Poped element : " + s.pop());
        System.out.println("Top element : " + s.top());
        System.out.println("Poped element : " + s.pop());
        System.out.println("Top element : " + s.top());
    }
}
