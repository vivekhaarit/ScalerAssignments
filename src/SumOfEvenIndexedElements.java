import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfEvenIndexedElements {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] nums = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(sumOfEvenIndexedElements(nums,new int[][] {{1,3},{2,4}}));
    }

    public static int[] sumOfEvenIndexedElements(int[] ar, int[][] Q) {
        int[] pf = new int[ar.length];
        int[] ans = new int[Q.length];
        pf[0]=ar[0];
        for(int i=1;i<ar.length;i++){
            if(i%2==0) pf[i] = pf[i-1] + ar[i];
            else pf[i] = pf[i-1];
        }
        for (int i = 0; i < Q.length; i++) {
            int l = Q[i][0];
            int r = Q[i][1];
            if(l==0) ans[i] = pf[r];
            else{
                ans[i] = pf[r] - pf[l-1];
            }
        }
        return ans;
    }

}
