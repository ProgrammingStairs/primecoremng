// Example showing the concept of jagged array
class Demo11{
    public static void main(String args[]){
        int arr[][] = new int[5][];
        arr[0] = new int[]{11,2};
        arr[1] = new int[]{1,6,1,2};
        arr[2] = new int[]{67,78,90,11,2};
        arr[3] = new int[]{11,2,7};
        arr[4] = new int[]{11,2,5,6,7,8,9,0};
        
        System.out.println("\nArray elements are : \n");
        for(int ar[] : arr){
            for(int element : ar){
                System.out.print(element+"\t");
            }
            System.out.println();                
        }        
    }
}

