public class Pascal {
    public int Fact(int i){
       if(i==0) return 1;
        return i*Fact(i-1);
    }
    
    public static void main(String args[]){
        int n=5;
        Pascal ps=new Pascal();
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+ps.Fact(i)/(ps.Fact(i-j)*ps.Fact(j)));
            }
            System.out.println();
        }

    }
}
