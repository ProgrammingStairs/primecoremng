// example showing the concept of constructor
import java.util.Scanner;
class Demo9{
    int age;
    String name;
    Demo9(){}
    Demo9(String name,int age){
        this.name=name;
        this.age=age;     
        System.out.println("Parameterized constructor called");
    }
    void display(){
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        Demo9 obj = new Demo9(name,age); // parameterized constructor
        obj.display();
        System.out.println("After copying : ");
        Demo9 objNew = new Demo9();
        objNew.name = obj.name; 
        objNew.age =  obj.age;
        objNew.display();
    }
}