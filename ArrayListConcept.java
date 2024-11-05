import java.util.ArrayList;
import java.util.Collections;



public class ArrayListConcept {
    public static void main(String args[]){
        ArrayList<Integer> store=new ArrayList<>();

        // add element 

        store.add(2);
        store.add(4);
        store.add(5);


        System.out.println(store);

        //get element

        int val1 = store.get(0);
        int val2 = store.get(1);
        int val3 = store.get(2);

        System.out.println(val1);

        // modify element

        store.add(0,3);
        System.out.println(store);

        //set element 

        store.set(0,6);
        System.out.println(store);

        //delete element

        store.remove(1);
        System.out.println(store);

        // size element

        int size = store.size();
        System.out.println(size);

        //loop 

        for(int i=0;i<store.size();i++){
            System.out.print(store.get(i)+" ");
        }

        // sorting

        Collections.sort(store);
        

        
    }
    
}
