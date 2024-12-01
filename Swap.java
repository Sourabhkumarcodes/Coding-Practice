public class Swap {

    public void Swapfun(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
        Swap sw = new Swap();
        int a = 5;
        int b = 6;
        sw.Swapfun(a,b);
    }
}
