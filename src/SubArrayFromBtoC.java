import java.util.Scanner;
import java.util.stream.Stream;

public class SubArrayFromBtoC {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] nums = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(nums,1,2));
    }

    public static int[] solve(int[] A, int B, int C) {
        int[] ar = new int[C-B+1];
        System.out.println(ar.length);
        for(int i=B,j=0;i<=C;i++,j++){
            ar[j]=A[i] ;
        }
        return ar;
    }

}
