import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class RightRotateArrayKTimes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e -> Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        reverseArray(A, 2);
        Arrays.stream(arr).forEach(System.out::print);
    }

//    public static void solve(int[] arr, int k) {
//
//        for (int i = 0; i < k; i++) {
//            int tmp = arr[arr.length - 1];
//            for (int j = arr.length - 2; j >= 0; j--) {
//                arr[j + 1] = arr[j];
//            }
//            arr[0] = tmp;
//        }
//    }


    public static int[] reverseArray(int[] arr, int k) {
        k = k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        return arr;
    }

    private static void reverse(int[] arr, int l, int r) {
        while(l<r){
            int tmp = arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
            l++;
            r--;
        }
    }

}
