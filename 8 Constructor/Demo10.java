// example showing the concept of constructor
import java.util.Scanner;
class Demo10{
    int age;
    String name;
    Demo10(String name,int age){
        this.name=name;
        this.age=age;     
        System.out.println("Parameterized constructor called");
    }
    Demo10(Demo10 obj){
        age = obj.age;
        name = obj.name;
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
        Demo10 obj = new Demo10(name,age); // parameterized constructor
        obj.display();
        System.out.println("After copying : ");
        Demo10 objNew = new Demo10(obj);
        objNew.display();
    }
}