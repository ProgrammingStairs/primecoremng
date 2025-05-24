// example showing the concept of nested class 
// inner class | non-static nested class 
// member class
class EnclosingClass{
    void show(){
        NestedClass obj = new NestedClass();
        obj.display();
    }
    class NestedClass{
        void display(){
            System.out.println("display method called of Nested Class");
        }
    }
}
class Demo6{ 
    public static void main(String args[]){
        EnclosingClass eobj = new EnclosingClass();
        eobj.show();
    }
}