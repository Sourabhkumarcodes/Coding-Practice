public class Fib {
    public static void fib(int n1,int n2,int n){
        
        for(int i=0;i<3;i++){
            int c = n1;
            n1 = n2;
            n2 = c + n1;
            System.out.print(n2+" ");
        }
    }
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n = 5;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        fib(n1,n2,n);
    }
    
}
