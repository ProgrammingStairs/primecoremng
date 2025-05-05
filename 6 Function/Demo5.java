// Example showing the concept of member function
// with argument with return type
import java.util.Scanner;
class Demo5{
    int addition(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Demo5 obj = new Demo5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num : ");
        int num = sc.nextInt();
        System.out.println("Factorial : "+obj.addition(num)); // with argument
    }
}