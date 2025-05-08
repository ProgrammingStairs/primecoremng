// example showing the concept of constructor

class Demo3{
    Demo3(){
        int rno = 101;
        String name = "Andrew Anderson";
        double per = 89;
        System.out.println("Default constructor called");
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
    }
}