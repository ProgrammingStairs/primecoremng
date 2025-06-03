// Program showing the concept of Exception Handling

class Demo9{
    public static void main(String args[]){
        try{
            Object obj = new Integer(100); // upcasting
            String str = (String)obj; // downcasting
        }catch(ClassCastException e){
            System.out.println("Exception : "+e);
        }
    }
}