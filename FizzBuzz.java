import java.util.*;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> myList=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                myList.add("FizzBuzz");
            }
            else if(i%3==0){
                myList.add("Fizz");
            }
            else if(i%5==0){
                myList.add("Buzz");
            }
            else{
                myList.add(String.valueOf(i));
            }
        }
        System.out.println(myList);
        return myList;

    }
    public static void main(String args[]){
        FizzBuzz sl=new FizzBuzz();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sl.fizzBuzz(n);
    }
}