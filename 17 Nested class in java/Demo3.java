// example showing the concept of nested class 
// static nested class 

class EnclosingClass{
    static int a = 100;
    static private int b = 200;
    static class NestedClass{
        void display(){
            System.out.println("display method called of Nested Class");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
    }
}
class Demo3{ 
    public static void main(String args[]){
        EnclosingClass.NestedClass obj = new EnclosingClass.NestedClass();
        obj.display();
    }
}