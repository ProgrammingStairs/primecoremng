// example showing the concept of constructor
import java.util.Scanner;
class Demo5{
    int age;
    String name;
    Demo5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Default constructor called");
    }
    void display(){
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        obj.display();
    }
}