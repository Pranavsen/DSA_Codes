public class StockBuy {
    // public static int maxpro(int arr[]){
    //     int maxi =0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i+1; j < arr.length; j++) {
    //             if(arr[j]>arr[i]){
    //                 maxi = Math.max(maxi,arr[j]-arr[i]);
    //             }
    //         }
    //     }
    //     return maxi;
    // }

        public static int maxpro(int arr[]){
            int maxi = 0;
            int mini = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                mini = Math.min(mini, arr[i]);
                maxi = Math.max(maxi, arr[i]-mini);
            }
            return maxi;
        }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxProfit=maxpro(arr);
        System.out.println("Max profit is : "+ maxProfit );
    }
}
