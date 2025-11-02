import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfOddIndexedElementsInaRange {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(sumOfOddIndexedElements(A, new int[][]{{1,4},{0,2},{2,3}}));
    }

    public static int[] sumOfOddIndexedElements(int[] A, int[][] Q) {
        int[] pf_odd_idx = new int[A.length];
        pf_odd_idx[0] = 0;
        for(int i=1;i<A.length;i++){
            if(i%2==1) pf_odd_idx[i] = pf_odd_idx[i-1] + A[i];
            else pf_odd_idx[i] = pf_odd_idx[i-1];
        }
        int[] ans = new int[Q.length];
        for(int i=0;i<Q.length;i++){
            int l = Q[i][0];
            int r = Q[i][1];
            if(l==0) ans[i] = pf_odd_idx[r];
            else {
                ans[i] = pf_odd_idx[r] - pf_odd_idx[l-1];
            }
        }
        return ans;

    }

}
