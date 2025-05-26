// example showing the concept of getClass method
class Demo4{
    public static void main(String args[]){
        Object obj = new String();
        Class c = obj.getClass();
        System.out.println("class name : "+c.getName());

        Demo4 obj1 = new Demo4();
        Class c1 = obj1.getClass();
        System.out.println("class name : "+c1.getName());

    }
}