public class BubbleSort{
    static void bubblesort(int arr[]){
        int len =arr.length;
        int count = 0;
        while(count<len){
            for (int i = 0; i < len-count-1; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            count++;
        }
    }
    public static void main (String[] args){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println(" Array before bubble sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        bubblesort(arr);
        System.out.println(" Array after bubble sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}