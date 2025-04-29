// Example to arrange array elements in ascending order | selection sort
import java.util.Scanner;
class Demo7{
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

        // selection sort logic
        for(i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("\nArray elements in ascending order : \n");
        for(i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }      
    }
}