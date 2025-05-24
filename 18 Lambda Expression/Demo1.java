// Example showing the concept of lambda expression
interface Showable{
    int age=18; // public static final int age=18;
    void printAge();
}
class Demo1{
    public static void main(String args[]){
        Showable obj = ()->System.out.println("Age : "+Showable.age);
        obj.printAge(); 
    }
}
