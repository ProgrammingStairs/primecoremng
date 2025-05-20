// example showing the concept of abstraction
import java.util.Scanner;
abstract class RBI{
    RBI(){
        System.out.println("-----Welcome to Bank-----");
    }
    abstract double rate(); // abstract method
    // concrete method
    double finalSum(int bal, double rate){
        return bal + bal*rate/100;
    }
}
class SBI extends RBI{
    @Override
    double rate(){
        return 2.34;
    }
} 
class BOI extends RBI{
    @Override
    double rate(){
        return 1.34;
    }
} 
class PNB extends RBI{ 
    @Override
    double rate(){
        return 3.21;
    }
} 

class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Balance : ");
        int bal = sc.nextInt();

        RBI obj;

        obj = new SBI();
        System.out.println("Sum provided by SBI : "+obj.finalSum(bal,obj.rate()));
        
        obj = new BOI();
        System.out.println("Sum provided by BOI : "+obj.finalSum(bal,obj.rate()));
        
        obj = new PNB();
        System.out.println("Sum provided by PNB : "+obj.finalSum(bal,obj.rate()));
    }
}

/*
    abstract ---------> class Series
            abstract method ---- series(int n,int m)                 

    child class ----- EvenSeries
                      OddSeries
*/