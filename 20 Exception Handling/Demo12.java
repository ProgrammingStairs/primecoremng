// Program showing the concept of Exception Handling
// user defined exception
import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class WithDraw{
    int bal;
    WithDraw(int bal){
        this.bal=bal;
    }
    void withDraw() throws InsufficientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount : ");
        int wamt = sc.nextInt();
        if(wamt>bal){
           throw new InsufficientBalanceException("Low Balance");
        }else{
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            System.out.println("Remaining Balance : "+(bal-wamt));
        }
    }
}
class Bank{
    int bal;
    Bank(int bal){
        this.bal=bal;
    }
    void display() throws InsufficientBalanceException{
        WithDraw obj = new WithDraw(bal);
        obj.withDraw();
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter balance : ");
       int bal = sc.nextInt();
       Bank obj = new Bank(bal); 
       try{
           obj.display(); 
       }catch(InsufficientBalanceException e){
           System.out.println("Exception : "+e);
       }
    }
}