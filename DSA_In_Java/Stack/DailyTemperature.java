import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class DailyTemperature {

    static Vector<Integer> NGRindex(int arr[], Vector<Integer> v) {
        // Vector<Integer> ans = new Vector<>();
        Stack<Integer> stk = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stk.size() == 0) {
                v.add(-1);
            } else if (stk.size() > 0 && stk.peek() > arr[i]) {
                v.add(stk.peek());
            } else if (stk.size() > 0 && stk.peek() <= arr[i]) {
                while (stk.size() > 0 && stk.peek() <= arr[i]) {
                    stk.pop();
                }
                if (stk.size() == 0) {
                    v.add(-1);
                } else {
                    v.add(stk.peek());
                }
            }
            stk.add(arr[i]);
        }
        Collections.reverse(v);
        return v;
    }

    static Vector<Integer> dailyTemp(int arr[]) {
        Vector<Integer> v = new Vector<>();
        NGRindex(arr, v);
        Vector<Integer> ans;
        for (int i = 0; i < ans.size(); i++) {
            if (v[i] == 0) {
                ans.add(0);
            } else {
                ans.add(v[i] - i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
        Vector<Integer> ans = dailyTemp(arr);
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }
}
