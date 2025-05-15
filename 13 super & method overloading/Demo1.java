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
}
class Child extends Parent{
    String name = "Peter Parker";
    void display(){
        System.out.println("Parent name : "+super.name);
        System.out.println("Child name : "+name);
    }
}
class Demo1{
    public static void main(String args[]){
        Child cobj = new Child();
        cobj.display();
    }
}
