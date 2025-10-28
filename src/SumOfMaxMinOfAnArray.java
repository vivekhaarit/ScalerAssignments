import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfMaxMinOfAnArray {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.next().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

    }

    public int solve(int[] A) {
        int max = A[0];
        int min = A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max) max = A[i];
            if(A[i]<min) min = A[i];
        }
        return max+min;
    }
}
