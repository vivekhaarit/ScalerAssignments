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
        int max_profit = 0;
        int max_right = ar[ar.length-1];
        for(int i=ar.length-1;i>=0;i--){
            if(max_right<ar[i]) {
                max_right = ar[i];
            }
            profit = max_right-ar[i];
            max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
    }
}
