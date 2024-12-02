public class Linear {

    public static int search(int arr[],int x){
        int N=arr.length;
        for(int i=0;i<N;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[] ={1,3,5,7,9};
        int x=6;

        int result=search(arr,x);
        if(result==-1){
            System.out.println("no such value");
        }
        else{
            System.out.println("at index " +result);
        }
    }
}
