/*
        *
       **
      ***
     ****
    *****
*/
import java.util.Scanner;
class Demo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
     
        for(int i = rows ; i>=1 ; i--) 
        {                  
            for(int j = 1; j<= rows ; j++)
            {  
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

