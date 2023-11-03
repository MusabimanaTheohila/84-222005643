class Interest{
    public double print(int p, double r, int t){
        return p*r*t;
    }
}
class Main{
    public static void main(String[]args){
        Interest a=new Interest();
        double Output=a.print(100000,0.05,5);
        System.out.println("Result:"+Output);
    }
}
