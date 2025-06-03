// example showing the concept of Thread 

class Demo2{
    void display(){
        System.out.println("Current Thread : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.display();
    }
}