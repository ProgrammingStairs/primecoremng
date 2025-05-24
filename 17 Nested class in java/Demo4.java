// example showing the concept of nested class 
// inner class | non - static nested class 

class EnclosingClass{
    static int a = 100;
    private int b = 200;
    class NestedClass{
        void display(){
            System.out.println("display method called of Nested Class");
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
    } 
    public static void main(String args[]){
        EnclosingClass obj = new EnclosingClass();
        NestedClass objNested = obj.new NestedClass();
        objNested.display();
    }
}