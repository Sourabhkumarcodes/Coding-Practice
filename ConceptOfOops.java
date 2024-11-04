
class Pen {
    String color;
    String type;
    String company;
    
    public void printing(){
        System.out.println(this.color);
    }
}

    


public class ConceptOfOops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.type = "gel";
        pen1.color = "black";
        pen1.company = "reynold";

        pen1.printing();
    }
    
}
