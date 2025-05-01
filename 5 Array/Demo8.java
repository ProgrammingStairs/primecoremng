// Example showing the concept of linear search
import java.util.Scanner;
class Demo8{
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
        
        System.out.println("Enter element which you want to be search : ");
        int element = sc.nextInt();
        boolean flag=false;
        for(i=0;i<size;i++){
            if(element==arr[i]){
                System.out.println("Element found at index : "+(i+1));
                flag = true;
                // break;
            }
        }

        if(!flag)
            System.out.println("Element not found");
             
    }
}