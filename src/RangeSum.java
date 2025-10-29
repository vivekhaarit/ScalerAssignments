import java.util.Scanner;
import java.util.stream.Stream;

public class RangeSum {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] nums = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(sumRange(nums,2,4));
    }

    public static int sumRange(int[] nums, int left, int right) {
        int sum = 0;
        while(left<=right){
            sum += nums[left];
            left++;
        }
        return sum;
    }


}



