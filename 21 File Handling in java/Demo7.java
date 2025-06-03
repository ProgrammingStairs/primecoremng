// program showing the concept of file handling in java
import java.io.*;
class Demo7{
    public static void main(String args[]){
        File file1 = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile1.txt");
        File file2 = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile2.txt");
        
        try(FileInputStream fin1 = new FileInputStream(file1);
        FileInputStream fin2 = new FileInputStream(file2);
        SequenceInputStream sin = new SequenceInputStream(fin1,fin2);){
            while(true){
                int i = sin.read();
                if(i==-1)
                    break;
                System.out.print((char)i);
            }            
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }
    }
}