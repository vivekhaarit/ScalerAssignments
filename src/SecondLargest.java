import java.util.Scanner;
import java.util.stream.Stream;

public class SecondLargest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.next().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int seconeLargest = 0;
        int max = A[0];
        if(A.length==1) return -1;
        else{
            for(int i=1;i<A.length;i++){
                if(max<A[i]) max = A[i];
            }
            for(int i=0;i<A.length;i++){
                if(seconeLargest<A[i] && seconeLargest < max) seconeLargest = A[i];
            }
        }
        return seconeLargest;
    }
}
