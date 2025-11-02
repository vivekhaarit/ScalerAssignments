import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class LeadersInArray {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(solve(A)));
    }


    public static int[] solve(int[] ar) {
        int leader = ar[ar.length - 1];
        int count = 1;
        for(int i=ar.length-2;i>=0;i--){
            if(ar[i]>leader) {
                leader = ar[i];
                count++;
            }
        }
        int[] leaders_ar = new int[count];
        leader = Integer.MIN_VALUE;
        for(int i=ar.length-1, j=0;i>=0;i--){
            if(ar[i]>leader) {
                leader = ar[i];
                leaders_ar[j] = ar[i];
                j++;
            }
        }
        return leaders_ar;
    }
}
