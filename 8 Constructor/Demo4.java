// example showing the concept of constructor

class Demo4{
    int rno;
    String name;
    double per;
    Demo4(){
        rno = 101;
        name = "Andrew Anderson";
        per = 89;
        System.out.println("Default constructor called");
    }
    void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.display();
    }
}