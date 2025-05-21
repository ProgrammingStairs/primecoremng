// Example showing the concept of interface 
interface Showable{
    void display(); // public abstract void display();
}
interface Movable{
    void show();
}
class Demo3 implements Showable,Movable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    @Override 
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.display();
        obj.show();
    }
}