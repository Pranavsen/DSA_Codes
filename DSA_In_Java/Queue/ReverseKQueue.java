import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKQueue {
    static Queue<Integer> q;

    static void reversekqueue(int k) {
        if(q.isEmpty()==true || k> q.size() || k<=0) return;
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<k;i++){
            stk.push(q.peek());
            q.remove();
        }
        while (!stk.isEmpty()) {
            q.add(stk.peek());
            stk.pop();
        }
        for (int i = 0; i < q.size()-k; i++) {
            q.add(q.peek());
            q.remove();
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
        int k= 3;
        reversekqueue(k);
        display();
    }

}
