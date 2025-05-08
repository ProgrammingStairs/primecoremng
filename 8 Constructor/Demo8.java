// example showing the concept of constructor chaining
// this can also be used to call current class constructor
class Demo8{
    int rno;
    String name;
    double per;
    Demo8(){
        this(101);
        System.out.println("Default constructor called");
    }
    Demo8(int rno){
        this(rno,"Andrew Anderson");
    }
    Demo8(int rno,String name){
        this(rno,name,45.56);
    }
    Demo8(int rno,String name,double per){
        this.rno=rno;
        this.name=name;
        this.per=per;
        display();
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8(); 
    }
}