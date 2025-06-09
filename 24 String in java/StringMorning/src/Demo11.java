
import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        
        System.out.println(""+str.toLowerCase());
        System.out.println(""+str.toUpperCase());
        System.out.println(""+str.charAt(5));
        System.out.println(""+str.endsWith("user"));
        System.out.println(""+str.endsWith("USER"));
        System.out.println(""+str.indexOf('u'));
        
        String s = "                   Hello              ";
        System.out.println(""+s);
        System.out.println(""+s.trim());
    }
}
