// example showing the concept of static keyword
class Demo{
    static int count1=100; // static data member
    static int getCount1(){ // static member function
        return count1;
    }
}
class Demo8{
    static int count=100; // static data member
    static int getCount(){ // static member function
        return count;
    }
    public static void main(String args[]){
        System.out.println("Count : "+Demo8.count);
        System.out.println("Count : "+count);
        System.out.println("\nCount : "+Demo8.getCount());
        System.out.println("Count : "+getCount());
        System.out.println("\nCount : "+Demo.count1);
        System.out.println("Count : "+Demo.getCount1());
    }
}