//TC (best) -> nlog(n)
//TC (worst) -> nlog(n)
//SC -> O(n)

public class MergeSort {

    void merge(int arr[], int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;
        int leftarr[] = new int[len1];
        int rightarr[] = new int[len2];

        for (int i = 0; i < leftarr.length; i++) {
            leftarr[i] = arr[left + i];
        }
        for (int j = 0; j < rightarr.length; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < len1 && j < len2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k++] = leftarr[i++];
            } else {
                arr[k++] = rightarr[j++];
            }
        }

        while (i < len1) {
            arr[k++] = leftarr[i++];
        }
        while (k < len2) {
            arr[k++] = rightarr[i++];
        }

    }

    void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

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
