// Example showing the concept of lambda expression
import java.util.Scanner;
interface Showable{
    void calculate();
}
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Showable obj = ()->System.out.println("Sum : "+(a+b));
        obj.calculate(); 
    }
}
