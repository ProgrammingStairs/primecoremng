
import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        System.out.println();
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
