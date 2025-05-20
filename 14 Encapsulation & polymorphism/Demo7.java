// example showing the concept of method overriding
class RBI{
    double rate(){
        return 1.0;
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
class PNB extends RBI{} 

class Demo7{
    public static void main(String args[]){
        SBI obj1 = new SBI();
        BOI obj2 = new BOI();
        PNB obj3 = new PNB();

        System.out.println("Rate provided by SBI : "+obj1.rate());
        System.out.println("Rate provided by BOI : "+obj2.rate());
        System.out.println("Rate provided by PNB : "+obj3.rate());
    }
}