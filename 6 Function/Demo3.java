// Example showing the concept of member function
// no argument with return type
import java.util.Scanner;
class Demo3{
    int addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b;
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        System.out.println("Addition : "+obj.addition()); // no argument
    }
}