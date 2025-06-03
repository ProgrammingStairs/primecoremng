// Program showing the concept of Exception Handling

class Demo7{
    public static void main(String args[]){
        try{
        
            int arr[] = {1,2,3,4,5};
            System.out.println("element : "+arr[3]);

            String name = "Andrew Anderson";
            System.out.println("character : "+name.charAt(30)); 
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
    }
}