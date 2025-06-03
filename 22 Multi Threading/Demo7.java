// example showing the concept of Thread 

class Demo7 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("------> "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Exception : "+e);
            }
        }
    }
    public static void main(String args[]){
        Demo7 th1 = new Demo7();
        Demo7 th2 = new Demo7();
        th1.start();
        try{
            // Thread.sleep(1000);
            // th1.join();
            th1.join(5000);
        }catch(InterruptedException e){
            System.out.println("Exception : "+e);
        }
        th2.start();
    }
}