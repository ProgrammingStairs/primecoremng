// Example showing the concept of multi dimensional array
import java.util.Scanner;
class Demo15{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of 2d matrix: ");
        int n = sc.nextInt();
        System.out.println("Enter no. of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int c = sc.nextInt();
        
            int arr[][][] = new int[n][r][c];

            System.out.println("Enter elements : ");
            for(int i=0;i<n;i++){ // no. of 2d matrix
                for(int j=0;j<r;j++){ // no. of rows
                    for(int k=0;k<c;k++){ // no. of columns
                        arr[i][j][k] = sc.nextInt();
                    }
                }    
            }

            System.out.println("\nArray elements are : \n");
            for(int ar[][] : arr){
                for(int a[] : ar){
                    for(int element : a)
                        System.out.print(element+"\t");
                    System.out.println();                
                }
                System.out.println();                
            }        
    }
}


/*
    multi dimensional array
    -- it is a collection of 2d array
    -- <datatype> <arr_name>[][][] = new <datatype>[no. of 2d matrix][rows][columns];
    -- int arr[][][] = new int [2][3][3];

    1 2 3       3 4 5
    5 6 7       4 3 2
    7 6 5       2 1 3
       rxc          rxc
       3x3          3x3 

*/
