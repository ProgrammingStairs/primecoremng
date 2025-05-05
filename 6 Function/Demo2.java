//Example showing the concept of member function
// no argument no return type
import java.util.Scanner;
class Demo2{
    void addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition : "+(a+b));
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.addition(); // no argument
    }
}