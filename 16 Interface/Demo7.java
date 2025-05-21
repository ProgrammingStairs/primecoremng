// Example showing the concept of interface 

interface Showable{
    int age=18; // public static final int age=18;
    void printAge();
}
class GetAge implements Showable{
    @Override 
    public void printAge(){
        System.out.println("Age : "+age);
    }
}
class Demo7{
    public static void main(String args[]){
        Showable obj = new GetAge();
        obj.printAge(); 
    }
}