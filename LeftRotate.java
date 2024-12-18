public class LeftRotate {
    static void rotate(int arr[],int n,int d){
        for(int i=0;i<d;i++){
            int strt=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=strt;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int d=2;
        rotate(arr, n, d);
    }
}
