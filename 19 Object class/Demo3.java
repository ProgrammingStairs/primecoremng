// example showing the concept of equals method
class Complex{
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        else    
            return false;
    }
}
class Demo3{
    public static void main(String args[]){
        Complex c1 = new Complex();
        Complex c2 = new Complex();
          if(c1.equals(c2))
            System.out.println("True");
          else  
            System.out.println("False");
    }
}