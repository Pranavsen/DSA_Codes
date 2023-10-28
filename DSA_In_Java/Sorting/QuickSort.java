public class QuickSort {
    

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println(" Array before merge sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        MergeSort m1 = new MergeSort();
        m1.sort(arr, 0, arr.length - 1);
        System.out.println(" \nArray after merge sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
