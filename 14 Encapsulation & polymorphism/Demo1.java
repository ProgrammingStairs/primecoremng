// example showing the concept of encapsulation
import java.util.Scanner;
class Student{
    // data members
    private int rno;
    private String name;

    // member functions
    // setter methods
    public void setRno(int rno){
        this.rno=rno;
    }
    public void setName(String name){
        this.name=name;
    }
    // getter methods
    public int getRno(){
        return rno;
    }
    public String getName(){
        return name;
    }   
}
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Enter roll number : ");
        int rno = sc.nextInt();

        Student obj = new Student();
        obj.setRno(rno);
        obj.setName(name);

        System.out.println("Roll number : "+obj.getRno());
        System.out.println("Name : "+obj.getName());
    }
}