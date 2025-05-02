// Example showing the concept of jagged array
import java.util.Scanner;
class Demo12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int row = sc.nextInt();
        int arr[][] = new int[row][];

        for(int i=0;i<row;i++){
            System.out.println("Enter columns for "+(i+1)+" row : ");
            int col = sc.nextInt();
            arr[i] = new int[col];
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }    
        }

        System.out.println("\nArray elements are : \n");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();                
        }        
    }
}

