// example showing the concept of constructor
import java.util.Scanner;
class Demo7{
    int age;
    String name;
    Demo7(){
        System.out.println("Default constructor called");
    }
    Demo7(String name,int age){
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
        Demo7 obj = new Demo7(name,age); // parameterized constructor
        obj.display();
        Demo7 obj1 = new Demo7();
    }
}