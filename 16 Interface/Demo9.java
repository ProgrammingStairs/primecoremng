// Example showing the concept of interface 

interface Showable{
    default void show(){
        System.out.println("show method called");
    }
    static void printData(){
        System.out.println("printData method called");
    }
}
class Demo9 implements Showable{
    public static void main(String args[]){
         Showable obj = new Demo9();
         obj.show();
         Showable.printData();
    }
}