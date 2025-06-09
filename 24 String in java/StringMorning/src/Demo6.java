
import java.util.Scanner;
import java.util.StringTokenizer;
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        /*
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        */
        
        String strArray[] = str.split(" ");
        for(String str1 : strArray){
            System.out.println(str1);
        }
    }
}
