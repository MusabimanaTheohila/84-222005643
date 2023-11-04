

// Program to to add to numbers using Method 
class Adder{
    public int add(int num1, int num2){
        return num1+num2;
    }
}
 class Main{
    public static void ma(String[]args){
        Adder myAdder= new Adder();
        int result= myAdder.add(5,3);
        System.out.println("Result:"+result);
    }
}