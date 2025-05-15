class Demo{
    Demo(){
        System.out.println("parent class");
    }
}
class Demo13 extends Demo{
    {
        System.out.println("initializer block");
    }
    Demo13(){
        super();
        // initializer block
        System.out.println("child class");
    }
    public static void main(String args[]){
        new Demo13();
    }
}