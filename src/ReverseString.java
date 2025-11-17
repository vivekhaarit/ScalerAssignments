public class ReverseString {

    public static void main(String[] args) {
        int[][] A = {{1,2},{4,5}};
        solve(A);
    }
    public static void solve(int[][] A) {
        int N = A.length;

        //transpose
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }



        //reverse array
        for(int i=0;i<N;i++){
            reverse(A[i]);
        }

    }

    public static void reverse(int[] ar){
        int l=0,r=ar.length-1;
        while(l<r){
            int temp = ar[l];
            ar[l] = ar[r];
            ar[r]= temp;
            l++;r--;
        }
    }
}
