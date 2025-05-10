// example

class Product{
    int pid;
    String name;
    double price;
    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Pid : "+pid);
        System.out.println("Price : "+price);
    }
}
class Example1{
    public static void main(String args[]){
        Product pobj1 = new Product(101,"Soap",45.56);
        Product pobj2 = new Product(102,"Fairness Cream",23.99);
        pobj1.display();
        pobj2.display(); 
    }
}

