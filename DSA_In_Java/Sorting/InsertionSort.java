//TC (best) -> O(n)
//TC (worst) -> O(n^2)
//SC -> O(1)

public class InsertionSort {
    void insertion(int arr[]){
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--; 
            }
            arr[j+1]=temp;
        }
    }

    static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        InsertionSort m1 = new InsertionSort();
        System.out.println(" Array before merge sorting");
        display(arr);        
        
       m1.insertion(arr);
        System.out.println(" \nArray after merge sorting");
        display(arr);
    }
}