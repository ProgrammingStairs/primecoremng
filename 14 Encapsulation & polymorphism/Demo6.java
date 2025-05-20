// example showing the concept of method overriding
class Parent{
    void show(){
        System.out.println("show of parent called");
    }
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
class Square extends Parent{} 

class Demo6{
    public static void main(String args[]){
        Rectangle obj1 = new Rectangle();
        obj1.show();
        Circle obj2 = new Circle();
        obj2.show();
        Square obj3 = new Square();
        obj3.show();
    }
}