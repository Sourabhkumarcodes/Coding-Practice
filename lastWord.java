import java.util.ArrayList;

public class lastWord{
    public int LastWord(String s){
         int count=0;
         for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else{
                if(count>0){
                    return count;
                }
            }
         }return count;
         
        
    }

    public static void main(String args[]){
       
        lastWord lst=new lastWord();
        String str="Hello World";
        lst.LastWord(str);
        
        
        

    }
}