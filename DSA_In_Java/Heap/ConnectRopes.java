import java.util.PriorityQueue;

public class ConnectRopes {
    
static int connectropes(int arr[]){
    PriorityQueue<Integer>pq = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
        pq.add(arr[i]);
    }
    int cost =0;
    while (pq.size()>1) {
        int first = pq.peek();
    pq.remove();
    int second = pq.peek();
    pq.remove();

    cost += first + second;
    pq.add(first + second);
    }
    return cost;

}
public static void main(String[] args) {
    int arr[] = {4,3,2,6};

    int ans = connectropes(arr);
    System.out.println("Cost is : "+ans);
}

    
}
