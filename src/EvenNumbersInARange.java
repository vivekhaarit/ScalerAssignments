import java.util.Scanner;
import java.util.stream.Stream;

public class EvenNumbersInARange {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(A,new int[][] {{1,3},{2,4}}));
    }

    public static int[] solve(int[] ar, int[][] Q) {
        int[] pf_count_even = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            if(i==0) {
                if(ar[i]%2==0) pf_count_even[0] = 1;
                else pf_count_even[0] = 0;
            } else {
                if(ar[i]%2==0){
                    pf_count_even[i] = pf_count_even[i-1] + 1;
                }else{
                    pf_count_even[i] = pf_count_even[i-1];
                }
            }
        }
        int[] ans = new int[Q.length];
        for(int i=0;i<Q.length;i++){
            int l = Q[i][0];
            int r = Q[i][1];
            if(l==0) ans[i]=pf_count_even[r];
            else{
                ans[i] = pf_count_even[r] - pf_count_even[l-1];
            }
        }
        return ans;
    }
}
