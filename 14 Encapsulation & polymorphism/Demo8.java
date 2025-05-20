// example showing the concept of run time polymorphism
class Parent{
    String name="Andrew Anderson";
    void display(){
        System.out.println("display of parent called");
    }
    void draw(){
        System.out.println("draw of parent called");
    }
}
class Child extends Parent{
    String name="Peter Parker";
    void display(){
        System.out.println("display of Child called");
    }
    void printData(){
        System.out.println("printData of child called");
    }
}
class Demo8{
    public static void main(String args[]){
        Parent obj = new Child(); // upcasting
        obj.display();
        obj.draw();
        System.out.println("Parent name : "+obj.name);
        Child cobj = (Child)obj; // downcasting
        cobj.printData();
        System.out.println("Child name : "+cobj.name);
    }
}