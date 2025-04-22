// program to print table of a number

import java.util.Scanner;
class Demo14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(num+" x "+i+" = "+(num*i));
            i++;
        }
    }
}