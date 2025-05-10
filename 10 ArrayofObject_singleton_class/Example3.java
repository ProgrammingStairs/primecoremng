// example showing the concept of array of object

import java.util.Scanner;
class Product{
    int pid;
    String name;
    double price;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id : ");
            pid = sc.nextInt();
            sc.nextLine();
        System.out.println("Enter product name : ");
            name = sc.nextLine();
        System.out.println("Enter product price : ");
            price = sc.nextDouble();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Pid : "+pid);
        System.out.println("Price : "+price);
    }
}
class Example3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of product : ");
        int num = sc.nextInt();

        Product pobj[] = new Product[num]; // reference array
        for(int i=0;i<pobj.length;i++){
            pobj[i] = new Product();
            pobj[i].getData();
        }
        System.out.println("product details : "); 
        for(int i=0;i<pobj.length;i++){           
            pobj[i].display();
        } 
    }
}

