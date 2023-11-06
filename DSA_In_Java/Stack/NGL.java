import java.util.Stack;
import java.util.Vector;

public class NGL {
    public static Vector<Integer> NearestGreatestLeft(int arr[]){
    Vector<Integer> ans = new Vector<>();
    Stack<Integer> stk = new Stack<>();
    for(int i =0;i<arr.length;i++){
        if(stk.size()==0){
            ans.add(-1);
        }
        else if(stk.size()>0 && stk.peek()>arr[i]){
            ans.add(stk.peek());
        }
        else if(stk.size()>0 && stk.peek()<arr[i]){
            while (stk.size()>0 && stk.peek()<arr[i]) {
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
    return ans;
}

public static void main(String[] args) {
    int arr[]={1,3,2,4,3};
    Vector<Integer> ans = NearestGreatestLeft(arr);
    for (Integer integer : ans) {
        System.out.print(integer+" ");
    }
}    
}
