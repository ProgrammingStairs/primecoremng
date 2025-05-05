// Example showing the concept of member function
// with argument no return type
import java.util.Scanner;
class Demo4{
    void addition(int a,int b){
        System.out.println("Addition : "+(a+b)); 
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();           
        obj.addition(a,b); // with argument
    }
}