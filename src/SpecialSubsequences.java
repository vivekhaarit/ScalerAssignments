import java.util.Scanner;
import java.util.stream.Stream;

public class SpecialSubsequences {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String str = scanner.next();
        scanner.nextLine();
        System.out.println(solve(str));
    }

    public static long solve(String str) {
        int count_a = 0;
        long ans =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A') count_a++;
            else if (str.charAt(i)=='G') ans+=count_a;
        }
        return ans;
    }
}
