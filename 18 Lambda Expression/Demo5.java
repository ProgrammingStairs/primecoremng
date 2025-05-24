// Example showing the concept of lambda expression
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b);
}
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();            
        Showable obj;       

        obj = (a1,b1)->a1+b1;
        System.out.println("Sum : "+obj.calculate(a,b)); 

        obj = (a1,b1)->a1-b1;
        System.out.println("Sub : "+obj.calculate(a,b)); 

        obj = (a1,b1)->a1*b1;
        System.out.println("Mul : "+obj.calculate(a,b)); 

        obj = (a1,b1)->a1/b1;
        System.out.println("Div : "+obj.calculate(a,b)); 

    }
}
