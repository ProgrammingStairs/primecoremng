/*
    Initializer Block : 
        1. static initializer block (static block)
        2. instance initializer block
*/ 
class Demo10{
    public static void main(String args[]){
        int a = 100;
        // normal block
        {
            int b = 200;
            System.out.println("a : "+a);
            System.out.println("b : "+b);
        }
        // System.out.println("b : "+b);
    }
}