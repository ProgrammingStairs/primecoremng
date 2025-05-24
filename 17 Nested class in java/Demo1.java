// example showing the concept of nested class 
// static nested class 

class EnclosingClass{
    static class NestedClass{
        void display(){
            System.out.println("display method called of Nested Class");
        }
    } 
    public static void main(String args[]){
        NestedClass obj = new NestedClass();
        obj.display();
    }
}