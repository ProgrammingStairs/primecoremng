// example showing the concept of finalize method
@Deprecated
class Demo5{
    @Override
    protected void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String args[]){
       Demo5 obj = new Demo5();
       System.out.println("hashCode : "+obj.hashCode());

       obj = null;
       System.gc(); 
    }
}