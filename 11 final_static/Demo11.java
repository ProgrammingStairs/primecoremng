class Demo11{
    final int a;
    // initializer block
    {
        a = 300;
    }
    public static void main(String args[]){
        Demo11 obj = new Demo11();
        System.out.println("value of a : "+obj.a);        
    }
}