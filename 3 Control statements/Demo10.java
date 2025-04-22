// program showing the concept of switch control statement
import java.util.Scanner;
class Demo10{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("Select any one : \n");
       System.out.println("1 for add");
       System.out.println("2 for sub");
       System.out.println("3 for mul");
       System.out.println("4 for div");
       System.out.println("5 for exit");

       System.out.println("Enter choice : ");
       int choice = sc.nextInt();

       switch(choice){
            case 1 : 
                System.out.println("Add : "+(a+b));
                break;
            case 2 : 
                System.out.println("Sub : "+(a-b));
                break;
            case 3 : 
                System.out.println("Mul : "+(a*b));
                break;
            case 4 : 
                System.out.println("Div : "+((double)a/b));
                break;
            default : 
                System.out.println("Invalid selection");
                break;
       }
    }
}