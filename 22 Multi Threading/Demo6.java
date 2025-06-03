// example showing the concept of Thread 

class Demo6 extends Thread{
    public void run(){
        System.out.println("Current Thread : "+Thread.currentThread().getName()+" isAlive : "+Thread.currentThread().isAlive());
    }
    public static void main(String args[]){
        Demo6 th1 = new Demo6();
        Demo6 th2 = new Demo6();
        Demo6 th3 = new Demo6();

        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.NORM_PRIORITY);
        th3.setPriority(Thread.MAX_PRIORITY);

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

        System.out.println("isAlive th1 : "+th1.isAlive());
        System.out.println("isAlive th2 : "+th2.isAlive());
        System.out.println("isAlive th3 : "+th3.isAlive());
    }
}