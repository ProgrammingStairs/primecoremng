
import java.util.Scanner;
public class Demo9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        
        String str[] = s.split(" ");
        for(int i=0;i<str.length/2;i++){
            String temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }
        System.out.println("\nAfter Reversing\n");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
