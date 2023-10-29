//TC (best) -> nlog(n)
//TC (worst) -> log(n^2)
//SC -> O(nlog(n))

public class QuickSort {
    
 int partition(int arr[],int begin,int end){
     int pivot = arr[begin];
    int leftptr =begin;
    int rightptr = end;
    while (leftptr<rightptr) {
        while (arr[leftptr]<=pivot) {
            leftptr++;
        }
        while (arr[rightptr]>pivot) {
            rightptr--;
        }
        if(leftptr<rightptr){
            int temp = arr[leftptr];
            arr[leftptr] = arr[rightptr];
            arr[rightptr] = temp;
        }
    }
    arr[begin] = arr[rightptr];
    arr[rightptr] =pivot;
    return rightptr;
}

void quicksorting(int arr[],int begin,int end){
    if(begin<end){
        int pi = partition(arr,begin,end);
        quicksorting(arr, begin, pi-1);       
        quicksorting(arr, pi+1, end);
    }
}


static void display(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        QuickSort m1 = new QuickSort();
        System.out.println(" Array before merge sorting");
        display(arr);        
        
        m1.quicksorting(arr, 0, arr.length - 1);
        System.out.println(" \nArray after merge sorting");
        display(arr);
    }
}
