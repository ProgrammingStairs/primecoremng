// example showing the concept of array of object

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
class Example2{
    public static void main(String args[]){
        Product pobj[] = new Product[2]; // reference array
        // System.out.println(pobj[0]);
        // System.out.println(pobj[1]);
        
        pobj[0] = new Product(101,"Soap",45.56);
        pobj[1] = new Product(102,"Fairness Cream",23.99);
        //Product pobj[] = new Product[2]; // Array of object 
        // System.out.println(pobj[0]);
        // System.out.println(pobj[1]);
        
        pobj[0].display();
        pobj[1].display(); 
    }
}

