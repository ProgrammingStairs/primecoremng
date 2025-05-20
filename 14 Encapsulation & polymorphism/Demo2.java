// example showing the concept of method overloading
class Demo2{
    void greater(int a,int b){
        int res = a>b?a:b;
        System.out.println("Greater Number : "+res);
    }
    void greater(int a,int b,int c){
        int res = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.greater(45,56);
        obj.greater(455,67,78);   
    }
}