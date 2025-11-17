import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class NobleInteger {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

        System.out.println(solve(A));
    }

    public static int solve(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        if(arr.length==1) return -1;
//        int greater_count = 0;
//            if(arr[i]!=arr[i-1]) greater_count = i;
//            if(arr[i]==greater_count) return 1;
//        }
        return -1;
    }
}
