public class RotateMatrix {

    // public static int[][] rotate(int arr[][]){
    // int len = arr.length;
    // int rotated[][] = new int[len][len];
    // for (int i = 0; i < len; i++) {
    // for (int j = 0; j < len; j++) {
    // rotated[j][len-i-1] = arr[i][j];
    // }
    // }                                                           TC-> O(n^2) SC-> O(n^2)
    // return rotated;
    // }
    // public static void main(String[] args) {
    // int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    // int rotated[][] = rotate(arr);

    // System.out.println("Rotated Image");
    // for (int i = 0; i < rotated.length; i++) {
    // for (int j = 0; j < rotated.length; j++) {
    // System.out.print(rotated[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }

    public static void rotate(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp;
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length / 2; j++) {            // TC-> O(n^2)+O(n^2) SC-> O(1)
                int temp;
                temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);

        System.out.println("Rotated Image");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
