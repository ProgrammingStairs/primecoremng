// example showing the concept of Thread Synchronization
// Inter Thread Communication

class Customer{
    int bal;
    Customer(int bal){
        this.bal=bal;
    }
    synchronized void withDraw(int wamt){
        if(wamt>bal){
            System.out.println("Low Balance...");
            try{wait();}catch(InterruptedException e){}
        }
        System.out.println("Balance : "+bal);
        System.out.println("Withdraw Amount : "+wamt);
        System.out.println("Remaining Balance : "+(bal-wamt));
    }
    synchronized void deposit(int damt){
        System.out.println("Going to Deposit...");
        this.bal += damt;
        System.out.println("Amount Deposited...");
        notify();
    }
}
class Demo13{
    public static void main(String args[]){
        Customer obj = new Customer(10000);
        new Thread(){
            @Override
            public void run(){
                obj.withDraw(15000);
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                obj.deposit(15000);
            }
        }.start();
        
    }
}