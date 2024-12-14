import java.util.*;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        int originalNum=number;
        int len=String.valueOf(number).length();

        int sum=0;
        while(number!=0){
            int digit=number%10;
            sum+=Math.pow(digit, len);
            number/=10;
        }

        if(sum==originalNum){
            System.out.println(originalNum+" is a Armstrong");
        }else{
            System.out.println(originalNum + " is not armstrong");
        }
        sc.close();
    }
}
