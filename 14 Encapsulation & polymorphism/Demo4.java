// example showing the concept of method overloading
class Demo4{
    void greater(int a,int b){
        int res = a>b?a:b;
        System.out.println("Greater Number : "+res);
    }
    void greater(double a,double b){
        double res = a>b?a:b;
        System.out.println("Greater Number : "+res);
    }
    public static void main(String args[]){
        Demo4 obj = new Demo4();
        obj.greater(45,56);
        obj.greater(45.5,67.78);   
    }
}