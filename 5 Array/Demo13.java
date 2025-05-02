// Example to add two 2d array
import java.util.Scanner;
class Demo13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int arr3[][] = new int[row][col];

        System.out.println("Enter elements for first matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j] = sc.nextInt();
            }    
        }

        System.out.println("Enter elements for second matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j] = sc.nextInt();
            }    
        }

        System.out.println("\nArray elements of first matrix : \n");
        for(int ar[] : arr1){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();                
        }        
        System.out.println("\nArray elements of second matrix : \n");
        for(int ar[] : arr2){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();                
        }        
        System.out.println("\nResultant Array after addition : \n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j]+"\t");
            }
            System.out.println();                
        }        
    }
}

