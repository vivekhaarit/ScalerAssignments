import java.util.Scanner;
import java.util.stream.Stream;

public class CountOfElements {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.next().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int max = A[0];
        int count = 0;
        for(int i=1;i<A.length;i++){
           if(max<A[i]) max = A[i];
        }

        for (int i = 0; i < A.length; i++) {
            if(max<A[i]) count++;
        }
        return count;
    }
}
