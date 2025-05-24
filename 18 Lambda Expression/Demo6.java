// Example showing the concept of method reference
import java.util.Scanner;
interface Showable{
    int calculate(int a,int b);
}
class Demo6{
    int getSum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();            
        Showable obj = new Demo6() :: getSum;
        System.out.println("Result : "+obj.calculate(a,b));
    }
}


/*
    Method Reference : 
        i. Reference to a static method
        ii. Reference to an instance method
        iii. Reference to a constructor
*/