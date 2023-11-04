import java.util.*;

public class KthGreatest{
static int kthgreatest(int arr[],int k){
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
        pq.add(arr[i]);
        if(pq.size()>k){
            pq.remove();
        }
    }
    return pq.peek();
}
    public static void main(String[] args) {
        int arr[] = {4,8,2,6,10};
        int k = 3;
        System.out.println("Kth greatest element : "+kthgreatest(arr,k));
    }
}