public class BinToDec {
    public void BiToDec(int n){
        int[] arr = new int[1000] ;

        int i=0;
        while(n!=0){
            arr[i] = n % 2;
            n = n / 2;
            i++;
        }

        for (int j = i-1 ; j >= 0;j--){
            System.out.print(arr[j]);
        }
    }
    public static void main(String args[]){
        BinToDec bl = new BinToDec();
        int n = 11;
        bl.BiToDec(n);
    }
}
