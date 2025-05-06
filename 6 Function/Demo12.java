// this can also be used to return current class object

class Demo12{
    void show(){
        System.out.println("show method called");
    }
    Demo12 display(){
        System.out.println("display method called");
        return this;
    }
    public static void main(String args[]){
        Demo12 obj = new Demo12();
        // Demo12 obj1 = obj.display();
        // obj1.show();
        obj.display().show();
    }
}