

public class Factorial {

    public static int calFac(int n){
        if(n==1||n==0){
            return 1;
        }

        int nm1=calFac(n-1);
        int result=n*nm1;
        return result;
    }
    public static void main(String args[]){
        int n=5;
        int ans=calFac(n);
        System.out.println(ans);


    }
    
}
