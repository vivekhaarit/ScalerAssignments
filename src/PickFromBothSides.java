import java.util.Scanner;
import java.util.stream.Stream;

public class PickFromBothSides {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String[] arr = scanner.nextLine().split(" ");
        int[] A = Stream.of(arr).map(e->Integer.parseInt(e)).mapToInt(Integer::intValue).toArray();

        System.out.println(solve(A,3));
    }

    public static int solve(int[] A, int B) {
        int[] pf = new int[B+1];
        int[] sf = new int[B+1];

        pf[0]=0;
        for(int i=1,j=0;i<=B;i++,j++){
            pf[i]=pf[i-1]+A[j];

        }

        sf[B] = 0;
        for(int i=B-1,j=A.length-1;i>=0;i--,j--){
            sf[i]=sf[i+1]+A[j];
        }

        int max = pf[0]+sf[0];
        for(int i=0;i<=B;i++){
            if(max<pf[i]+sf[i]) max = pf[i]+sf[i];
        }
        return max;
    }
}
