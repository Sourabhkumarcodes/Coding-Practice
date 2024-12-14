public class XORswap {
    public static void main(String args[]){
        int a=34;
        int b=30;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a val "+a+" b val "+b);
    }
}
