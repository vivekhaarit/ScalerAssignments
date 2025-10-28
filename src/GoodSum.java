import java.util.Scanner;
import java.util.stream.Stream;

public class GoodSum {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.next().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println( solve(A,5));
    }

    public static int solve(int[] A, int B) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
               if(i!=j && A[i]+A[j] == B) return 1;
            }
        }
        return 0;
    }
}
