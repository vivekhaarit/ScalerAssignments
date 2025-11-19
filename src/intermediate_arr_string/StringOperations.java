package intermediate_arr_string;

public class StringOperations {

    public static void main(String[] args) {
        String name = "VivEk";
        System.out.println(solve(name));;
    }

    public static String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        for(int i=0;i<A.length();i++){
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z'){
                sb.replace(i,i+1,"");
            }
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
                sb.replace(i,i+1,"#");
            }
        }
        return sb.append(sb).toString();
    }
}
