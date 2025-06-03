// program showing the concept of file handling in java
import java.io.*;
class Demo11{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");

        try(FileWriter fw = new FileWriter(file)){
            fw.write("Statement 1\n");
            fw.write("Statement 2\n");
            fw.write("Statement 3\n");
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

        try(FileReader fr = new FileReader(file)){
            while(true){
                int i = fr.read();
                if(i==-1)
                    break;
                System.out.print((char)i);
            }    
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

    }
}