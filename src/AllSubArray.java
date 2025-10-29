import java.util.Scanner;
import java.util.stream.Stream;

public class AllSubArray {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] nums = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(nums));
    }

    public static int[][] solve(int[] A) {
        int n = A.length;
        int[][] subarr = new int[(n*(n + 1))/2][];
        System.out.println(subarr.length);
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                int tmp_arr_length = j-i+1;
                int[] tmp = new int[tmp_arr_length];
                for(int k=i;k<=j;k++){
                    tmp[k] = A[k];
                }
                subarr[j]=tmp;
            }
        }

        return subarr;

    }
}
