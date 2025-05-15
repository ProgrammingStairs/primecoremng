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
    Parent(){
        System.out.println("Parent name : "+name);
    }
}
class Child extends Parent{
    String name = "Peter Parker";
    Child(){
        super();
        System.out.println("Child name : "+name);
    }
}
class Demo3{
    public static void main(String args[]){
        new Child();
    }
}
