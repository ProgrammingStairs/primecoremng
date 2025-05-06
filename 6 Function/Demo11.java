// this can also be pass as an argument in function calling

class Demo11{
    void show(Demo11 x){
        System.out.println("show method called");
        System.out.println("x : "+x);
    }
    void display(){
        System.out.println("display method called");
        show(this);
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        obj.display();
    }
}