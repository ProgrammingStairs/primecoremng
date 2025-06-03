// example showing the concept of Thread 

class Demo5 extends Thread{
    public void run(){
        System.out.println("Current Thread : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority()+" Thread Id : "+Thread.currentThread().getId());
    }
    public static void main(String args[]){
        Demo5 th1 = new Demo5();
        Demo5 th2 = new Demo5();
        Demo5 th3 = new Demo5();

        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        // try{
        //     Thread.sleep(4000);
        // }catch(InterruptedException e){
        //     System.out.println("Exception : "+e);
        // }
        th2.start();
        //         try{
        //     Thread.sleep(4000);
        // }catch(InterruptedException e){
        //     System.out.println("Exception : "+e);
        // }
        th3.start();
    }
}