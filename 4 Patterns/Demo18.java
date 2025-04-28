/*
        *
       * *
      *   *
     *     *
    * * * * *
*/
import java.util.Scanner;
class Demo18{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();

        // for(int i = 1 ; i<=rows ; i++) 
        // {
        //     for(int sp=1;sp<=rows-i;sp++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<= 2*i-1 ; j++)
        //     {
        //         if(j==1 || j==2*i-1 || (i==rows && j%2!=0))        
        //             System.out.print("*");
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        for(int i = 1 ; i<=rows ; i++) 
        {
            for(int sp=1;sp<=rows-i;sp++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i ; j++)
            {
                if(j==1 || j==i || i==rows)        
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}

