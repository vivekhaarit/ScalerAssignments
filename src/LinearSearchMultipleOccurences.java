import java.util.Scanner;
import java.util.stream.Stream;

public class LinearSearchMultipleOccurences {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.next().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(A,5));
    }
    public static int solve(int[] A, int B) {
        int count = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B) count++;
        }
        return count;
    }
}

