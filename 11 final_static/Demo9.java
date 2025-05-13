// example showing the concept of static keyword
import java.util.Scanner;
class Demo9{
    int rno;
    String name;
    static String cname;
    Demo9(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    static void getCName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter college name : ");
        cname = sc.nextLine();
    }
    void getData(){
        System.out.println(rno+" "+name+" "+cname);
    }
    public static void main(String args[]){
        getCName();
        Demo9 obj1 = new Demo9(101,"Andrew Anderson");
        Demo9 obj2 = new Demo9(102,"Peter Parker");
        obj1.getData();
        obj2.getData();    
    }
}