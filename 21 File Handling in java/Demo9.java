// program showing the concept of file handling in java
import java.io.*;
class Demo9{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");
        try(FileInputStream fin = new FileInputStream(file);
        DataInputStream din = new DataInputStream(fin);){
            System.out.println("integer data : "+din.readInt());            
            System.out.println("double data : "+din.readDouble());            
            System.out.println("boolean data : "+din.readBoolean());            
            System.out.println("string(utf) data : "+din.readUTF());            
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }
    }
}