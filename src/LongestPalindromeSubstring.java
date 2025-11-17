import java.util.Scanner;
import java.util.stream.Stream;

public class LongestPalindromeSubstring {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an array: ");

        String string = scanner.next();
        scanner.nextLine();
        System.out.println(longestPalindrome(string));
    }

    public static String longestPalindrome(String str) {
        String ans = "";
        for(int i=0;i<str.length();i++){
            String oddLength = expandCenter(str, i,i);
            if(oddLength.length()>ans.length()){
                ans = oddLength;
            }
            String evenLength = expandCenter(str, i,i+1);
            if(evenLength.length()>ans.length()){
                ans = evenLength;
            }
        }
        return ans;
    }

    public static String expandCenter(String s, int l, int r){
        int N = s.length();
        StringBuilder str = new StringBuilder(s);
        while(l>=0 && r<N && str.charAt(l)==str.charAt(r)){
            l--;r++;
        }
        return str.toString().substring(l+1,r);

    }
}
