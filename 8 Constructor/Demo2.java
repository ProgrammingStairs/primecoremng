// example showing the concept of constructor

class Demo2{
    Demo2(){
        System.out.println("Default constructor called");
    }
    public static void main(String args[]){
        // Demo2 obj1 = new Demo2(), obj2 = new Demo2(), obj3 = new Demo2();

        Demo2 obj;
        obj = new Demo2();
        obj = new Demo2(); 
        obj = new Demo2();
    }
}