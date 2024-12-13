public class Lcm {
    static int lcm(int n1,int n2){
        int max;
        if(n1>n2){
            max=n1;
        }else{
            max=n2;
        }
        while(true){
            if(max %n1 == 0 && max %n2 == 0){
                return max;
            }
            max++; //if not true
        }

    }
    public static void main(String args[]){
        int n1=30;
        int n2=10;
        int res=lcm(n1, n2);
        System.out.println(res);
    }
}
