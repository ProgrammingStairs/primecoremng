// example showing the concept of toString()

class Demo2{
    int rno = 100;
    String name = "Andrew Anderaon";
    String address = "Indore";

    @Override
    public String toString(){
        return rno+" "+name+" "+address;
    }
    @Override
    public int hashCode(){
        return rno;
    }

    public static void main(String args[]){
        Demo2 obj = new Demo2();
        Demo2 obj1 = new Demo2();
        System.out.println("obj : "+obj);
        System.out.println("obj : "+obj.hashCode());
        System.out.println("obj1 : "+obj1.hashCode());
    }
}