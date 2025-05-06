// Example showing the concept of member function
// this keyword is used to represent current class data member
import java.util.Scanner;
class Demo9{
    int a,b; // instance variable
    void setData(int a,int b){
        this.a = a;
        this.b = b;
    }
    void add(){
        System.out.println("add : "+(a+b));
    }
    void sub(){
        System.out.println("sub : "+(a-b));
    }
    void mul(){
        System.out.println("mul : "+(a*b));
    }
    void div(){
        System.out.println("div : "+(a/b));
    }
    void mod(){
        System.out.println("mod : "+(a%b));
    }

    public static void main(String args[]){
        Demo9 obj = new Demo9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.setData(a,b);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.mod();
    }
}