import java.util.Scanner;
import java.util.stream.Stream;

public class EquilibriumIndexOfAnArray {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int[] sum_lower_idx = new int[A.length];
        int[] sum_higher_idx = new int[A.length];

        sum_lower_idx[0] = A[0];
        for(int i=1;i<A.length;i++){
            sum_lower_idx[i] = sum_lower_idx[i-1] + A[i];
        }

        sum_higher_idx[A.length-1] = A[A.length-1];
        for(int i=A.length-2;i>=0;i--){
            sum_higher_idx[i] = sum_higher_idx[i+1] + A[i];
        }

        for(int i=0;i<A.length;i++){
            if(sum_lower_idx[i]==sum_higher_idx[i]) return i;
        }
        return -1;
    }
}
