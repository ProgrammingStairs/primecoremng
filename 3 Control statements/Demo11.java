// program showing the concept of switch control statement
import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("Select any one : \n");
       System.out.println("+ for add");
       System.out.println("- for sub");
       System.out.println("* for mul");
       System.out.println("/ for div");
       System.out.println("e for exit");

       System.out.println("Enter choice : ");
       char choice = sc.next().charAt(0);

       switch(choice){
            case '+' : 
                System.out.println("Add : "+(a+b));
                break;
            case '-' : 
                System.out.println("Sub : "+(a-b));
                break;
            case '*' : 
                System.out.println("Mul : "+(a*b));
                break;
            case '/' : 
                System.out.println("Div : "+((double)a/b));
                break;
            case 'e' : 
                System.out.println("User wants to exit");
                break;
            default : 
                System.out.println("Invalid selection");
                break;
       }
    }
}
