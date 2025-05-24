// Example showing the concept of interface 

interface Showable{
    default void show(){
        System.out.println("show method called of showable");
    }
}
interface Movable{
    default void show(){
        System.out.println("\nshow method called of movable");
    }
}
class Demo11 implements Showable,Movable{
    public void show(){
        System.out.println("\nshow method called of Demo11");
    }
    public static void main(String args[]){
         Demo11 obj = new Demo11();
         obj.show();
    }
}