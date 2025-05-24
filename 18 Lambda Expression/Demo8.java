// Example showing the concept of  method reference
import java.util.Scanner;
interface Showable{
    void calculate(int a,int b);
}
class Demo8{
    Demo8(int a,int b){
        System.out.println("Result : "+(a+b));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();            
        Showable obj = Demo8 :: new;
        obj.calculate(a,b);
    }
}


/*
    Method Reference : 
        i. Reference to a static method
        ii. Reference to an instance method
        iii. Reference to a constructor
*/