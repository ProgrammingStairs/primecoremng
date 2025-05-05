// Example showing the concept of member function
import java.util.Scanner;
class Demo6{
    void operation(int a,int b){
        System.out.println("add : "+(a+b));
        System.out.println("sub : "+(a-b));
        System.out.println("mul : "+(a*b));
        System.out.println("div : "+(a/b));
        System.out.println("mod : "+(a%b));
    }
    public static void main(String args[]){
        Demo6 obj = new Demo6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        obj.operation(a,b);
    }
}