// example showing the concept of abstraction
abstract class Parent{
    abstract void show();
}
class Rectangle extends Parent{
    @Override
    void show(){
        System.out.println("Its rectangle");
    }
} 
class Circle extends Parent{
    @Override
    void show(){
        System.out.println("Its circle");
    }
} 
class Square extends Parent{
    @Override
    void show(){
        System.out.println("Its square");
    }
} 

class Demo3{
    public static void main(String args[]){
        Parent obj;
        obj = new Rectangle();
        obj.show();
        obj = new Circle();
        obj.show();
        obj = new Square();
        obj.show();
    }
}