// Eager initialization
class Singleton{
    private Singleton(){}
    static private final Singleton instance = new Singleton(); 
    static Singleton getInstance(){
        return instance;
    }
    int a=100;
    static void display(){
        System.out.println(instance);
    }
}
class Example5{
    public static void main(String args[]){
        // Singleton.display();
        Singleton obj1 = Singleton.getInstance();
        System.out.println("value of a : "+obj1.a);
        obj1.a+=200;
        System.out.println("value of a : "+obj1.a);
        Singleton obj2 = Singleton.getInstance();
        System.out.println("value of a : "+obj2.a);
        
    }
}