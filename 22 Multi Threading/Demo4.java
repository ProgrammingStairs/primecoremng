// example showing the concept of Thread 

class Demo4 extends Thread{
    public void run(){
        System.out.println("Current Thread : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority()+" Thread Id : "+Thread.currentThread().getId());
    }
    public static void main(String args[]){
        Demo4 th1 = new Demo4();
        Demo4 th2 = new Demo4();
        Demo4 th3 = new Demo4();

        th1.start();
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        th2.start();
                try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        th3.start();
    }
}