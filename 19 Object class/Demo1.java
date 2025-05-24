// example showing the concept of toString()

class Demo1{
    int rno = 100;
    String name = "Andrew Anderaon";
    String address = "Indore";

    @Override
    public String toString(){
        return rno+" "+name+" "+address;
    }

    public static void main(String args[]){
        Demo1 obj = new Demo1();
        System.out.println("obj : "+obj);
        System.out.println("obj : "+obj.toString());
    }
}