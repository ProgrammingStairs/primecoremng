// example showing the concept of Thread 

class Demo8 implements Runnable{
    public void run(){
        System.out.println(""+Thread.currentThread().getName());
    }
    public static void main(String args[]){
        Demo8 obj = new Demo8();
        Thread th1 = new Thread(obj);
        th1.start();
    }
}