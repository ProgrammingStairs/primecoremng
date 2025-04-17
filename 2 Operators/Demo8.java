// average
import java.util.Scanner;
class Demo8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Average : "+(a+b+c)/3.0);
        System.out.printf("Average : %.2f",(a+b+c)/3.0);

    }
}

/*
Assignment  

1. Program to find out area of circle
2. Perimeter of rectangle 
3. Volume of cylinder 
4. Temp conversion from f to c 
5. Area of triangle by heron's formula

*/