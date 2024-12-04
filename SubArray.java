public class SubArray {
    static int arr[]={1,2,3,4};
        public static void subarray(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=i;k<=j;k++)
                        System.out.print(arr[k]+" " );
                        System.out.println();
                }
        }
    }
    public static void main(String args[]){
        
        SubArray.subarray(arr.length);
    }
}
