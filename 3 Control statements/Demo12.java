// program showing the concept of switch control statement
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter color : ");
       String color = sc.next().toLowerCase();

       switch(color){
            case "red" : 
                System.out.println("Its red color");
                break;
            case "green" : 
                System.out.println("Its green color");
                break;
            default : 
                System.out.println("Invalid selection");
                break;
       }
    }
}
