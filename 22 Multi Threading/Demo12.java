// example showing the concept of Thread Synchronization
// Static Synchronization

class First{
    // It contains resources
    static synchronized void display(String name){
        System.out.print(" [ ");
        try{ Thread.sleep(1000); }catch(InterruptedException e){}
        System.out.print(name);
        try{ Thread.sleep(1000); }catch(InterruptedException e){}
        System.out.println(" ] ");
    }
}
class Second extends Thread{
    // From this we create threads
    String name;
    Second(String name){
        this.name=name;
        start();
    }
    public void run(){
        First.display(name);
    }
}
class Demo12{
    public static void main(String args[]){
        Second s1 = new Second("Andrew");
        Second s2 = new Second("Mathew");
        Second s3 = new Second("Jackson");
    }
}