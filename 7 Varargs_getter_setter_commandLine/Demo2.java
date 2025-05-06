// example showing the concept of varargs(variable arguments)

class Demo2{
    void test(int...arr){
        System.out.println("\nElements are : ");
        for(int element : arr)
            System.out.print(element+"\t");
    }
    public static void main(String args[]){
        Demo2 obj = new Demo2();
        obj.test(10,20);
        obj.test(10,20,30);
        obj.test(10,20,30,40);
        obj.test(10,20,30,40,50);
    }
}