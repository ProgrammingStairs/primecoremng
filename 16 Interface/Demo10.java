// Example showing the concept of interface 

interface Showable{
    default void show(){
        System.out.println("show method called");
        data();
    }
    default void printData(){
        System.out.println("\nprintData method called");
        data();
    }
    private void data(){
        System.out.println("statement1");
        System.out.println("statement2");
    }
}
class Demo10 implements Showable{
    public static void main(String args[]){
         Showable obj = new Demo10();
         obj.show();
         obj.printData();
    }
}