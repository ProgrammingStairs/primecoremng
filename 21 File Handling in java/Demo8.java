// program showing the concept of file handling in java
import java.io.*;
class Demo8{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");
        try(FileOutputStream fout = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fout)){
            dos.writeInt(12345);
            dos.writeDouble(123.45);
            dos.writeBoolean(true);
            dos.writeUTF("This is an example");
            System.out.println("Data Inserted Successfully");
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }
    }
}