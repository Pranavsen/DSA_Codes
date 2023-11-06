import java.util.PriorityQueue;

public class KClosest {

    static void kclosest(int arr[], int k, int element) {
        class Pair {
            Integer key;
            Integer value;

            Pair(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
        // public Integer getKey(){
        //     return value;
        // }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(Math.abs(arr[i] - element), arr[i]));
            if (pq.size() > k) {
                pq.remove();
            }
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().value);
            pq.remove();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9 };
        int k = 3;
        int element = 7;
        kclosest(arr, k, element);
    }
}
