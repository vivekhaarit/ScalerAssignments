package intermediate_arr_string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class NobleInteger {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

        System.out.println(solve(A));
    }

    public static int solve(int[] arr) {
        Arrays.sort(arr);
        //reversing
       int l = 0, r = arr.length-1;
       while(l<r){
           int temp = arr[l];
           arr[l]=arr[r];
           arr[r]=temp;
           l++;r--;
       }
        if(arr.length==1 || arr[0]==0) return -1;
        int greater_count = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]) greater_count = i;
            if(arr[i]==greater_count) return 1;
        }
        return -1;
    }
}
