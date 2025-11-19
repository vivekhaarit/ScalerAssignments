package intermediate_arr_string;

import java.util.Scanner;
import java.util.stream.Stream;

public class SubarrayWithLeastAverage {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split("\\s+");
        int[] ar = Stream.of(nums).mapToInt(Integer::parseInt).toArray();
        System.out.println(solve(ar,3));
    }

    public static int solve(int[] A, int k) {
        int minavg = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += A[i];
        }

        minavg = sum/k;

        int i=1, j=k;
        while(j < A.length){
            int avg = (sum - A[i] + A[j])/k;
            minavg = Math.min(minavg, avg);
            i++;j++;
        }
        return minavg;
    }
}
