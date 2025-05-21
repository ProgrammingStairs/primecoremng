// Example showing the concept of interface 
@FunctionalInterface
interface Showable{
    void display(); // public abstract void display();
}
class Demo5 implements Showable{
    @Override 
    public void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Showable obj = new Demo5();
        obj.display();
    }
}