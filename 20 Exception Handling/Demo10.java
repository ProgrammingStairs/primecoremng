// Program showing the concept of Exception Handling

class Demo10{
    public static void main(String args[]){
        try{
            Class.forName("Demo9");
            System.out.println("Class Found");
        }catch(ClassNotFoundException e){
            System.out.println("Class Not Found");
            System.out.println("Exception : "+e);
        }
    }
}