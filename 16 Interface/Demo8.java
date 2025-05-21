// Example showing the concept of interface (Anonymous class) 
/*
interface Showable{
    int age=18; // public static final int age=18;
    void printAge();
}
class Demo8{
    public static void main(String args[]){
        Showable obj = new Showable(){
            @Override 
            public void printAge(){
                System.out.println("Age : "+age);
            }       
        };
        obj.printAge(); 
    }
}
*/

interface Showable{
    int age=18; // public static final int age=18;
    void printAge();
}
class Demo8{
    public static void main(String args[]){
        new Showable(){
            @Override 
            public void printAge(){
                System.out.println("Age : "+age);
            }       
        }.printAge(); 
    }
}