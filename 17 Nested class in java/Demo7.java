// example showing the concept of nested class 
// inner class | non-static nested class 
// Local class
class EnclosingClass{
    void show(){
        class NestedClass{
            void display(){
                System.out.println("display method called of Nested Class");
            }
        }
        NestedClass obj = new NestedClass();
        obj.display();
    }
}
class Demo7{ 
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        eobj.show();
    }
}