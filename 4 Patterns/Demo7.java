/*
    1
    123
    12345
    1234567
    123456789

       2   4   6   8    10 .... 2 x i
    1   3   5    7   9 ........ 2 x i -1   
*/
import java.util.Scanner;
class Demo7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        for(int i = 1 ; i<=rows ; i++) 
        {
            for(int j = 1; j<= 2 * i - 1 ; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


