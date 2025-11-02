import java.util.Scanner;
import java.util.stream.Stream;

public class BestTimeToBuyAndSellStocks {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

        System.out.println(maxProfit(A));
    }

    public static int maxProfit(final int[] ar) {
        int profit = 0;
        for(int i=0;i<ar.length;i++){
            if(has_max_in_right(ar,i)) {
                profit = Math.max(profit, max_right(ar,i)-ar[i]);
            }
        }
        return profit;
    }

    private static int max_right(int[] ar, int curr) {
        int max = Integer.MIN_VALUE;
        for(int i=curr+1;i<ar.length;i++){
            if(ar[i]>max) max = ar[i];
        }
        return max;
    }

    private static boolean has_max_in_right(int [] ar, int curr){
        for(int i=curr+1;i<ar.length;i++){
            if(ar[i]>ar[curr]) return true;
        }
        return false;
    }
}
