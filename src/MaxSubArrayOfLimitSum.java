import java.util.Scanner;
import java.util.stream.Stream;

public class MaxSubArrayOfLimitSum {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

        System.out.println(maxSubarray(5,12,A));
    }


    public static int maxSubarray(int n, int limit, int[] A) {
        int[] pf = new int[n];
        pf[0] = A[0];
        for(int i=1;i<n;i++){
            pf[i] = pf[i-1]+A[i];
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int subArrSum = pf[j];
                if(i!=0) {
                    subArrSum -= pf[i-1];
                }
                if(subArrSum<=limit && subArrSum < ans) ans = subArrSum;
            }
        }

        return ans;
    }
}
