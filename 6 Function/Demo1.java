//Example showing the concept of member function

class Demo1{
    void display(){
        System.out.println("display method called");
    }
    public static void main(String args[]){
        Demo1 obj = new Demo1();
        obj.display();
        obj.display();

        new Demo1().display(); // anonymous object
        new Demo1().display(); // anonymous object

    }
}