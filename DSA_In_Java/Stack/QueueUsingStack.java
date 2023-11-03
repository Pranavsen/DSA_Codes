import java.util.Stack;

public class QueueUsingStack {
     Stack<Integer> stk1 = new Stack<Integer>();
    Stack<Integer> stk2 = new Stack<Integer>();

    public void push(int x) {
        stk1.push(x);
    }

    public int pop() {
        int x = -1;
        if (stk2.isEmpty()) {
            if (stk1.isEmpty()) {
                System.out.println("Queue is empty.");
                return x;
            } else {
                while (!stk1.isEmpty()) {
                    stk2.push(stk1.pop());
                }
            }
        }
        x = stk2.peek();
        stk2.pop();
        return x;

    }
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.push(2);
        q.push(4);
        q.push(6);
        q.push(8);
        q.push(10);

        System.out.println(q.pop());
        System.out.println(q.pop());
    }
}
