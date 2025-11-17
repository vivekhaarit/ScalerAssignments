public class AmazingSubarrays {

    public static void main(String[] args) {
        String name = "ABEC";
        solve(name);
    }

    public static  int solve(String ar) {
        char[] A = ar.toCharArray();

        int N = A.length;
        int count = 0;
        for(int i=0;i<N;i++){
            char ch = A[i];
            System.out.println(ch);
            if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'
                    ||ch=='O'||ch=='o'||ch=='U'||ch=='u'){
                count += N-i;
                System.out.println(ch);
            }
        }
        return count%1003;

    }
}
