// Example to check whether entered array is a palindrome or not
import java.util.Scanner;
class Demo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        System.out.println("\nEnter Array elements : \n");
        for(i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArray elements are : \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }

        // palindrome logic 
        for(i=0;i<size/2;i++){
            if(arr[i] != arr[size-1-i])
                break;
        }        
        if(i==size/2)
            System.out.println("\nArray is palindrome\n");
        else
            System.out.print("\nArray is not palindrome\n");
    }
}