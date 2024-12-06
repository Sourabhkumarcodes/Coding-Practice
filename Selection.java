public class Selection {
     static void selection(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        int[] arr= {23,56,11,34,45};
        selection(arr);
        print(arr);
    }
}
