// Example showing the concept of final variable 

class Demo1{
    final int a;
    Demo1(){
        a = 100;
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println("value of a : "+obj.a);
    }
}