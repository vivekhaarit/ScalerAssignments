import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] x){
        int n = x.length;
        for(int k=0;k<n;k++){
            int ele =x[k];
            for(int i=k+1;i<n;i++){
                if(x[i]==ele){
                    int j=i;
                    while(j<n-1){
                        x[j]=x[j+1];
                        j++;
                    }
                    n--;
                    i--;//j--  //not sure

                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,2,3,5,4,5};
        ar = removeDuplicates(ar);
        System.out.println(Arrays.toString(ar));
        //print array
    }
}
