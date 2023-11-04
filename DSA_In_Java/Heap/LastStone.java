import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStone {
    static int laststone(int arr[]){
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());  //MAX Heap

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (pq.size()>1) {
            int first = pq.peek();
            pq.remove();
            int second = pq.peek();
            pq.remove();
            if(first>second) pq.add(first-second);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
    
    public static void main(String[] args) {
        int arr[] = {2,7,4,1,8,1};
        int weight = laststone(arr);
        System.out.println("Last stone weight : "+weight);
    }
}
