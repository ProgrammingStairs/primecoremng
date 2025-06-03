// example showing the concept of Thread 

class Demo1{
    public static void main(String args[]){
        System.out.println("Current Thread : "+Thread.currentThread().getName());
        System.out.println("Current Thread : "+Thread.currentThread());
        Thread.currentThread().setName("MyThread");
        System.out.println("Current Thread : "+Thread.currentThread());
        System.out.println("Current Thread : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Current Thread : "+Thread.currentThread().getPriority());
             
    }
}