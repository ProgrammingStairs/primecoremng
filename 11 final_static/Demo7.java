// example showing the concept of static keyword
class Demo7{
    static int count=0;
    Demo7(){
        count++;
    }
    static int getCount(){
        return count;
    }
    public static void main(String args[]){
        new Demo7(); // anonymous object
        new Demo7(); // anonymous object
        new Demo7(); // anonymous object
        new Demo7(); // anonymous object
        new Demo7(); // anonymous object
        System.out.println("No. of objects created : "+Demo7.count);
        System.out.println("No. of objects created : "+Demo7.getCount());
    }
}