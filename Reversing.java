import java.util.Arrays;


public class Reversing {
    

        static void reverseing(int[] val){
        int n = val.length;

        int[] temp=new int[n];


        for(int i=0; i < n; i++){
            temp[i]=val[n-i-1];
        }

        for(int i=0;i<n;i++){
        val[i]=temp[i];
        }
    }

    public static void main(String args[]){
        int[] val = {4,6,2,6,8,9};
        reverseing(val);

        for(int i=0; i<val.length;i++){
            System.out.print(val[i]+" ");
        }

    }

   
    
}
