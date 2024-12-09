import java.util.*;

public class HashingMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Sourabh", 19);
        hm.put("xyz",19);

        System.out.println(hm);

        if(hm.containsKey("Sourabh")){
            System.out.println("Present");
        }else{
            System.out.println("not present");
        }

        hm.get("xyz");
        hm.remove("xyz");
        System.out.println(hm);
    }

}
