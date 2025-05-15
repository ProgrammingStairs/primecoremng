/*
Super Keyword
--------------
Super is mainly used to represent parent class
We use super keyword with : 
    a. variable 
    b. method 
    c. constructor
*/
class Parent{
    String name = "Andrew Anderson";
    void show(){
        System.out.println("Parent name : "+name);
    }
}
class Child extends Parent{
    String name = "Peter Parker";
    void show(){
        System.out.println("Child name : "+name);
    }
    void display(){
        super.show();
        show();
    }
}
class Demo2{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}
