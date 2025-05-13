// Example showing the concept of final variable 

class Demo3{
    public static void main(String args[]){
        final int arr[]={1,2,3,4,5};    
        arr[2] = 200;
        System.out.println("Array elements are : ");
        for(int element : arr){
            System.out.print(element+"\t");
        }
    }
}