// Example showing the concept of interface 
interface Showable extends Movable{
    void display(); // public abstract void display();
}
interface Movable{
    void show();
}
class Demo4 implements Showable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    @Override 
    public void show(){
        System.out.println("show method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo4();
        obj.display();
        obj.show();
    }
}