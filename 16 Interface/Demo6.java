// Example showing the concept of interface 
/*
interface Showable{
    int age=18; // public static final int age=18;
}
class Demo6{
    public static void main(String args[]){
        System.out.println("age : "+Showable.age);
    }
}
*/
/*
interface Showable{
    int age=18; // public static final int age=18;
}
class Demo6 implements Showable{
    public static void main(String args[]){
        System.out.println("age : "+age);
    }
}
*/

interface Showable{
    int age=18; // public static final int age=18;
}
interface Movable{
    int age=58; // public static final int age=58;
}

class Demo6{
    public static void main(String args[]){
        System.out.println("age : "+Showable.age);
        System.out.println("age : "+Movable.age);
    }
}