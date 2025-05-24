// example showing the concept of nested class 
// inner class | non-static nested class 

class EnclosingClass{
    int a = 100;
    static private int b = 200;
    class NestedClass{
        void display(){
            System.out.println("display method called of Nested Class");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
    }
}
class Demo5{ 
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        EnclosingClass.NestedClass obj = eobj.new NestedClass();
        obj.display();
    }
}