// example showing the concept of deadlock
class Pen{};
class Paper{};
class Demo14{
    public static void main(String args[]){
        Pen pn = new Pen();
        Paper pr = new Paper();
        new Thread(){
            public void run(){
                synchronized(pn){
                    System.out.println("Thread 1 uses pen and needs paper");
                    try{Thread.sleep(1000);}catch(InterruptedException e){}
                    synchronized(pr){
                        System.out.println("Thread 1 uses paper and needs pen");
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                synchronized(pr){
                    System.out.println("Thread 2 uses paper and needs pen");
                    try{Thread.sleep(1000);}catch(InterruptedException e){}
                    synchronized(pn){
                        System.out.println("Thread 2 uses pen and needs paper");
                    }
                }
            }
        }.start();
    }
}