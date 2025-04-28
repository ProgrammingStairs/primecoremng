// Basic example of array
import java.util.Scanner;
class Demo2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("\nEnter Array elements : \n");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements are : \n");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}