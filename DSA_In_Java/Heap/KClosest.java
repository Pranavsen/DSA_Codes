import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosest {

static void kclosest(int arr[],int k,int element){
    PriorityQueue<pair<Integer,Integer>>pq = new PriorityQueue<>(Comparator.reverseOrder());
    for(int i=0;i<arr.length;i++){
        pq.add({abs(arr[i]-element),arr[i]});
        if(pq.size()>k){
            pq.remove();
        }
    }
    while (pq.size()>0) {
        System.out.println(pq.peek().second);
        pq.remove();
    }
}

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        int k = 3;
        int element = 7;
       kclosest(arr,k,element);
    }
}
