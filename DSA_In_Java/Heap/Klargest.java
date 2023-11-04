import java.util.PriorityQueue;

public class Klargest {
    static void klargest(int arr[],int k){
    PriorityQueue<Integer>pq = new PriorityQueue<>();   //MIN Heap
    for (int i = 0; i < arr.length; i++) {
        pq.add(arr[i]);
        if(pq.size()>k){
            pq.remove();
        }
    }
    while (!pq.isEmpty()) {
        System.out.print(pq.peek()+", ");
        pq.remove();
    }
}

    public static void main(String[] args) {
        int arr[] = {4,8,2,6,10};
        int k = 3;
        System.out.println(k+" greatest element : ");
        klargest(arr,k);
    }
}
