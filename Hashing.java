import java.util.*;

public class Hashing {
    public static void main(String args[]){
    HashSet<Integer> list = new HashSet<>();
    //adding element
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list);
    
    //searching
    if(list.contains(1)){
        System.out.println("present");
    }
    if(!list.contains(6)){
        System.out.println("doesnt contain");
    }

    //removing
    list.remove(1);
    System.out.println(list);
    
    //iterator
    Iterator it =list.iterator();

    while(it.hasNext()){
        System.out.println(it.next());
    }
    

}


    

}
