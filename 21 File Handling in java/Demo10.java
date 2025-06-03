// program showing the concept of file handling in java
import java.io.*;
class Product implements Serializable{
    int pid;
    String name;
    double price;

    Product(int pid,String name,double price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return pid+"  "+name+"  "+price;
    }
}
class Demo10{
    public static void main(String args[]){
        Product pobj = new Product(123,"Soap",898.32);
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");
        try(FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oout = new ObjectOutputStream(fout);){
           oout.writeObject(pobj);
           System.out.println("Data inserted successfully");            
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }

        try(FileInputStream fin = new FileInputStream(file);
        ObjectInputStream ooin = new ObjectInputStream(fin);){
           Product obj = (Product)ooin.readObject();
           System.out.println(obj);            
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error while dealing with a file : "+e);
        }

    }
}