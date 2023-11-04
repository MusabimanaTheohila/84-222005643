class Teacher{
    int C_id;
    String name;
    int age;

void insertRecord(int C, String n, int a){
   C_id=C;
    name=n;
    age=a;
}
 void displayRecords(){
    System.out.println(C_id+" "+name+" "+age);
 }
}
 class Teacher1{
    public static void main(String[]args){

        Teacher a1=new Teacher();
    a1.insertRecord(3,"Ethan",30);
        a1.displayRecord();
    }
 }