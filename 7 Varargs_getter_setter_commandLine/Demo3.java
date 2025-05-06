// example showing the concept of varargs(variable arguments)
class Demo3{
    void test(String name,int...arr){
        System.out.println("\nElements are : ");
        System.out.print(name+"\t");
        for(int element : arr)
            System.out.print(element+"\t");
    }
    public static void main(String...args){
        Demo3 obj = new Demo3();
        obj.test("noname",10,20);
        obj.test("noname",10,20,30);
        obj.test("noname",10,20,30,40);
        obj.test("noname",10,20,30,40,50);
    }
}