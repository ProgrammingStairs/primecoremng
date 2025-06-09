
public class Demo2 {
    public static void main(String[] args) {
        // string literal
        String s1 = "Hello";
        System.out.println("s1 : "+s1);
        
        // by new keyword 
        String s2 = new String("Hello");
        System.out.println("s2 : "+s2);
        
        char data[] = {'a','b','c','d','e'};
        String s3 = new String(data);
        System.out.println("s3 : "+s3);
        
        byte bt[] = {65,66,67,68,69};
        String s4 = new String(bt);
        System.out.println("s4 : "+s4);
        
    }
}
