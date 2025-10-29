import java.util.Scanner;
import java.util.stream.Stream;

public class RangeSumQuery {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] nums = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        int[][] query = {{0,3},{1,2}};
        System.out.println(rangeSum(nums,query));
    }

    public static long[] rangeSum(int[] A, int[][] Q) {
        int[] pf_sum = new int[A.length];
        long[] ans = new long[Q.length];
        pf_sum[0]=A[0];
        for(int i=1;i<A.length;i++){
            pf_sum[i] = pf_sum[i-1] + A[i];
        }

        for(int i=0;i<Q.length;i++){
            int l = Q[i][0];
            int r = Q[i][1];
            if(l==0) ans[i] = pf_sum[r];
            else{
                ans[i]=pf_sum[r] - pf_sum[l-1];
            }
        }
        return ans;
    }
}
