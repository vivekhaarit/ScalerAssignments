import java.util.Scanner;
import java.util.stream.Stream;

public class SpecialIndex {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();
        System.out.println(solve(A));
    }

    public static int solve(int[] ar) {

        int[] pf_e = new int[ar.length];
        int[] pf_o = new int[ar.length];
        int countSpecialIndex = 0;

        pf_e[0] = ar[0];
        for (int i = 1; i <ar.length ; i++) {
            if(i%2==0) pf_e[i] = pf_e[i-1] + ar[i];
            else pf_e[i] = pf_e[i-1];
        }

        pf_o[0] = 0;
        for (int i = 1; i <ar.length ; i++) {
            if(i%2==1) pf_o[i] = pf_o[i-1] + ar[i];
            else pf_o[i] = pf_o[i-1];
        }

        for(int i=0;i<ar.length;i++){
            int even_sum = 0;
            int odd_sum = 0;
            if(i==0) {
                even_sum = pf_o[ar.length-1] - pf_o[0];
                odd_sum = pf_e[ar.length-1] - pf_e[0];
            } else {
                even_sum = pf_e[i-1] + pf_o[ar.length-1] - pf_o[i];
                odd_sum = pf_o[i-1] + pf_e[ar.length-1] - pf_e[i];
            }
            if(even_sum == odd_sum) countSpecialIndex++;
        }
        return countSpecialIndex;

    }
}
