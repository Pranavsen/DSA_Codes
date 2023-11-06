import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NGR {
public static Vector<Integer> NearestGreatestRight(int arr[]){
    Vector<Integer> ans = new Vector<>();
    Stack<Integer> stk = new Stack<>();
    for(int i = arr.length-1; i>=0; i--){
        if(stk.size()==0){
            ans.add(-1);
        }
        else if(stk.size()>0 && stk.peek()>arr[i]){
            ans.add(stk.peek());
        }
        else if(stk.size()>0 && stk.peek()<=arr[i]){
            while (stk.size()>0 && stk.peek()<=arr[i]) {
                stk.pop();
            }
            if(stk.size()==0){
                ans.add(-1);
            }else{
                ans.add(stk.peek());
            }
        }
        stk.add(arr[i]);
    }
    Collections.reverse(ans);
    return ans;
}

public static void main(String[] args) {
    int arr[]={4,5,2,10,8};
    Vector<Integer> ans = NearestGreatestRight(arr);
    for (Integer integer : ans) {
        System.out.print(integer+" ");
    }
}    
}