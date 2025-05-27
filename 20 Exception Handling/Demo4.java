// Program showing the concept of Exception Handling

import java.util.Scanner;
class Demo4{
    static void divide(int a,int b){
        try{
            int c = a/b;
                if(c>=5)
                    throw new ArithmeticException("Result Greater Than or Equals To 5");
            System.out.println("Result : "+c);
        }catch(ArithmeticException e){
            System.out.println("Exception : "+e.getMessage());
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