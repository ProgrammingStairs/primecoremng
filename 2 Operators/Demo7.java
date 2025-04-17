// example for taking values from user
import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum : "+a+b);
        System.out.println("Sum : "+(a+b));
        System.out.println(a+b+" : Sum");
        System.out.println((a+b)+" : Sum");
    }
}