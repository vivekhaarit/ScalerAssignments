package intermediate_arr_string;


public class LengthOfLongestConsequtiveOnes {

    public static void main(String[] args) {
        String name = "vivek";
        StringBuilder sb = new StringBuilder(name);
        sb.replace(0,1,"");
        System.out.println(sb.toString());
        solve(name);
    }

    public static int solve(String A) {
        char[] ar = A.toCharArray();
        int totalOnes = 0;
        int ans = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]=='1') totalOnes++;
        }

        if(totalOnes==ar.length) {
            ans = totalOnes;
        }


        for(int i=0;i<ar.length;i++){
            if(ar[i]=='0'){
                int j=i-1;
                int l=0;
                while(j>=0 && ar[j]=='1'){
                    l++;j--;
                }
                j = i+1;
                int r = 0;
                while(j<ar.length && ar[j]=='1'){
                    r++;j++;
                }
                if(l+r <= totalOnes) {
                    ans = Math.max(ans, l+r+1);
                }else{
                    ans = Math.max(ans, l+r);
                }
                System.out.println(ans);
            }
        }
        return ans;

    }
}
