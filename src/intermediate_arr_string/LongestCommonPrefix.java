package intermediate_arr_string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"abab", "ab", "abcd"};
        System.out.println(longestCommonPrefix(arr));;
    }

    public static String longestCommonPrefix(String[] A) {
        String str = A[0];
        int k=0;
        StringBuilder ans = new StringBuilder();
        while(k<str.length()){
            int i=1;
            for(;i<A.length;i++){
                String latestString = A[i];
                if(str.charAt(k)==str.charAt(k)) continue;
                break;
            }
            if(i==A.length) {
                ans.append(str.charAt(k));
                k++;
            }else{
                break;
            }
        }
        return ans.toString();
    }
}
