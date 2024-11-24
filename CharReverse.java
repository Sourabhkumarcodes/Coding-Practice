class CharReverse {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
        return;
        }
    public static void main(String args[]){
        CharReverse nw=new CharReverse();
        String str="hello";
        char[] sb=str.toCharArray();
        nw.reverseString(sb);
        System.out.println(sb);
        }
}