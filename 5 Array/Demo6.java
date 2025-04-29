// Example to insert an element at specific index
import java.util.Scanner;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size+1];
        int i;
        System.out.println("\nEnter Array elements : \n");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArray elements are : \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nEnter index : ");
        int index = sc.nextInt();
        System.out.println("\nEnter element : ");
        int element = sc.nextInt();

        // insertion logic
        for(i=size-1;i>=index;i--){
            arr[i+1] = arr[i];
        }       
        arr[index] = element;

        System.out.println("\nArray elements are : \n");
        for(i=0;i<=size;i++){
            System.out.print(arr[i]+"\t");
        }      
    }
}