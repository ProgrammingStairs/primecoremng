// Example showing the concept of 2d array
import java.util.Scanner;
class Demo10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        int i,j;
        System.out.println("\nEnter Array elements : \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
                arr[i][j] = sc.nextInt();
        }
        System.out.println("\nArray elements are : \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }        
    }
}