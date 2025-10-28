import java.util.Scanner;
import java.util.stream.Stream;

public class TimeToEquality {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.next().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int time = 0;
        int max = A[0];
        for(int i=1;i<A.length;i++){
            if(max<A[i]) max = A[i];
        }

        for(int i=0;i<A.length;i++){
            if(A[i]<max) time += max - A[i];
        }

        return time;
    }
}
