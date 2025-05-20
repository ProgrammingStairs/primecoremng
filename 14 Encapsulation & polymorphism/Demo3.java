// example showing the concept of constructor overloading
class Demo3{
    Demo3(int a,int b){
        int res = a>b?a:b;
        System.out.println("Greater Number : "+res);
    }
    Demo3(int a,int b,int c){
        int res = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo3 obj1 = new Demo3(45,56);
        Demo3 obj2 = new Demo3(455,67,78);   
    }
}