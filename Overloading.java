import java.util.*;
import bank.*;

class Student{
    String name;
    int age;

    // //overloading
    // public void printInfo(String name){
    //     System.out.println(name);
    // }

    // public void printInfo(int age){
    //     System.out.println(age);
    // }

    // public void printInfo(String name,int age){
    //     System.out.println( name + " " + age );
    // }
    
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
    }

    public void func(){
        System.out.println(name);
        System.out.println(age);
    }

    Student(){

    }
    

}


public class Overloading {
        public static void main(String args[]){
            // Student s1 = new Student();

            // s1.name = "hello";
            // s1.age = 23;

            // Student s2=new Student(s1);
            // s2.func();

            bank.Account acc1= new bank.Account();
            acc1.name = "hello";

            System.out.println(acc1.name);
            

           
        }    
}
