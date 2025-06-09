
public class Demo10 {
    public static void main(String[] args) {
//        String str = "Hello";
//        str.concat(" Andrew");
//        System.out.println("str : "+str);
//        System.out.println("str : "+str.concat(" Andrew"));
//        
//        StringBuffer sb = new StringBuffer("Hello");

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Andrew");
        System.out.println("Result : "+sb);
        
        sb.insert(6, "Mathew ");
        System.out.println("insert : "+sb);
        
        sb.replace(6, 12, "Peter");
        System.out.println("replace : "+sb);
        
        sb.delete(6, 12);
        System.out.println("delete : "+sb);
        
        sb.reverse();
        System.out.println("reverse : "+sb);
    }
}
