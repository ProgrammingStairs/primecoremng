// Example showing the concept of final variable 

class Demo4{
    public static void main(String args[]){
        final int arr[]={1,2,3,4,5};    
        int arr1[]={11,12,13,14,15};    

        arr1 = arr; // works fine
        // arr = arr1; // gives error
        System.out.println("Array elements are : ");
        for(int element : arr1){
            System.out.print(element+"\t");
        }

    }
}