// example showing the concept of static keyword
// static block 
class Demo5{
    static{
         System.out.println("statement 1");
    }
    public static void main(String args[]){
        System.out.println("main method");
    }
    static{
         System.out.println("statement 2");
    }
}