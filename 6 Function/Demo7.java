// Example showing the concept of member function
import java.util.Scanner;
class Demo7{
    void add(int a,int b){
        System.out.println("add : "+(a+b));
    }
    void sub(int a,int b){
        System.out.println("sub : "+(a-b));
    }
    void mul(int a,int b){
        System.out.println("mul : "+(a*b));
    }
    void div(int a,int b){
        System.out.println("div : "+(a/b));
    }
    void mod(int a,int b){
        System.out.println("mod : "+(a%b));
    }

    public static void main(String args[]){
        Demo7 obj = new Demo7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.add(a,b);
        obj.sub(a,b);
        obj.mul(a,b);
        obj.div(a,b);
        obj.mod(a,b);
    }
}