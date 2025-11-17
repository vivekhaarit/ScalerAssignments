public class BOBCount {

    public static void main(String[] args) {
        String name = "bobob";

        solve(name);
    }
    public static int solve(String A) {
//        String
        int bobCount =0;
        for(int i=0;i<A.length()-2;i++){
            if(A.charAt(i)=='b') {
                String substr = A.substring(i,i+3);
                if(A.substring(i,i+3).contentEquals("bob")){
                    bobCount++;
                }
            }
        }
        return bobCount;
    }


}
