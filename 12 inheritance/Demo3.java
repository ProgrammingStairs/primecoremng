// example showing the concept of Hierarchical inheritance
import java.util.Scanner;
class Person{
    int age;
    String name;
    void getData(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name : ");
        name = sc.nextLine();

        System.out.println("Enter age : ");
        age = sc.nextInt();
    }
    void printData(){
        System.out.println("\nDetails\n");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Student extends Person{
    int fees;
    String courseName;
    void getStudData(){
        getData();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Course name : ");
        courseName = sc.nextLine();

        System.out.println("Enter fees : ");
        fees = sc.nextInt();
    }
    void printStudData(){
        printData();
        System.out.println("Course Name : "+courseName);
        System.out.println("Fees : "+fees);
    }
}
class Employee extends Person{
    int salary;
    String desig;
    void getEmpData(){
        getData();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Designation name : ");
        desig = sc.nextLine();

        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
    }
    void printEmpData(){
        printData();
        System.out.println("Designation Name : "+desig);
        System.out.println("Salary : "+salary);
    }
}

class Demo3{
    public static void main(String args[]){
        Student sobj = new Student();
        Employee emp = new Employee();
        sobj.getStudData();
        emp.getEmpData();

        sobj.printStudData();
        emp.printEmpData();       
    }
}