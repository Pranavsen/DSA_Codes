//TC (best) -> O(n^2)
//TC (worst) -> O(n^2)
//SC -> O(1)

public class SelectionSort {

    void selectionsorting(int arr[]){
        int i,j, minIndex;
        for (i = 0; i < arr.length-1; i++) {
            minIndex = i;
        for(j=i+1;j<arr.length;j++){
            if(arr[j]<arr[minIndex])
                minIndex = j;
        }
        if(minIndex!=i){
            int temp =arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i]=temp;
        }
        }
    }

    static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        SelectionSort m1 = new SelectionSort();
        System.out.println(" Array before merge sorting");
        display(arr);        
        
        m1.selectionsorting(arr);
        System.out.println(" \nArray after merge sorting");
        display(arr);
    }
    
}
