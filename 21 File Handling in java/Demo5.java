// program showing the concept of file handling in java
import java.io.*;
class Demo5{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");
        try(FileInputStream fin = new FileInputStream(file)){
            while(true){
                int i = fin.read();
                if(i==-1)
                    break;
                System.out.print((char)i);
            }            
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }
    }
}