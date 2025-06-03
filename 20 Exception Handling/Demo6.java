// Program showing the concept of Exception Handling

class Demo6{
    // static String name = "Andrew Anderson";
    // static String name = "";
    static String name;

    public static void main(String args[]){
        try{
            System.out.println("length : "+name.length());
        }catch(NullPointerException e){
            System.out.println("Exception : "+e);
        }
    }
}