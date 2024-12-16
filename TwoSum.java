public class TwoSum {
    static int[] point(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }  return new int[]{};
        
    }
       public static void main(String args[]){
        int arr[]={1,2,5,6};
        int target=3;
        int[] res=point(arr, target);
        for(int i:res){
            System.out.println(i);
        }

    }
}
