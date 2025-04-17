// implicit type casting
class Demo12{
    public static void main(String args[]){
        int a = 100;
        double b = a; // implicit type casting
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        
        // double c = 100;
        double c = 100.56;
        int d = (int)c; // explicit type casting
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        
        byte a1 = 65, b1=65;
        byte res = (byte)(a1+b1);
        int res1 = a1+b1;
        System.out.println("res : "+res);
        System.out.println("res1 : "+res1);
        
    }
}

