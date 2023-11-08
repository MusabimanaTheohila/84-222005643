
// java program to elaborate the inheritance with implement and extend keyword


public class Vehicle{
     void speed(){
        System.out.println("It uses road transport");
    }
}
 class truck extends Vehicle{
     public void move(){
        System.out.println(" Move with high speed");
    }
}
interface G{
    void engine();
}
class lorry extends truck implements G{
    public void engine(){
        System.out.println(" Best engine ever"); 
    };
  }
 public class Quest{
     public static void main(String[] args){
  Vehicle da=new Vehicle();   // Creation of object
 da.print();
 da.speed();
 da.move();
   da.engine();
   da.Gear();

}
 }
 