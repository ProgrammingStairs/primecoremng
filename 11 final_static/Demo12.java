class Demo12{
    static{
        System.out.println("static block");
    }
    {
        System.out.println("initializer block");
    }
    Demo12(){
        // here initializer block will executes
        System.out.println("constructor");
    }
    public static void main(String args[]){
        new Demo12();
        new Demo12();
    }
}