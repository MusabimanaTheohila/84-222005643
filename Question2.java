  // jAva program to illustrate inheritance with implement and interface keyword
public class Sheep{
    void walk(){
        System.out.println("walking");
    }
}
public class Cat extends Sheep{
    public void Sleep(){
        System.out.println("They are so sleepy");
    }
}
interface E{
     void print();
}

class Dog extends Sheep implements E{
    public void Eat(){
        System.out.println("Eat bones");
    };
     public void print(){
        System.out.println("both are animals");
    };
    static public void  main(String args[]){
        Dog d = new Dog();  // object creation of object
        d.Eat();
        d.Sleep();
        d.walk();
        d.print();
    }
} 