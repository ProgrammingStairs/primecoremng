// example showing the concept of static keyword
// static block
class Demo{
    static{
         System.out.println("static block");
    }
} 
class Demo6{
    public static void main(String args[]){
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
    }
}