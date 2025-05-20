// example showing the concept of method overriding
class Parent{
    void show(){
        System.out.println("show of parent called");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("show of child called");
    }
} 
class Demo5{
    public static void main(String args[]){
        Child obj = new Child();
        obj.show();
    }
}