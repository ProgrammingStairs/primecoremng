// Program showing the concept of Exception Handling

import java.util.Scanner;
class Demo3{
    static void divide(int a,int b){
        try{
            int c = a/b;
            System.out.println("Result : "+c);
        }catch(ArithmeticException e){
            // System.out.println("Exception : "+e);
            // System.out.println("Exception : "+e.getMessage());
            // System.out.println("You are trying to divide a number by zero");
            e.printStackTrace();
        }      
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        divide(a,b);
    }
}