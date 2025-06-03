// example showing the concept of Thread 

class Demo3 extends Thread{
    public void run(){
        System.out.println("Current Thread : "+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo3 obj = new Demo3();
        obj.start();
    }
}