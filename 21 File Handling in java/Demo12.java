// program showing the concept of file handling in java
import java.io.*;
class Demo12{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");

        try(FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);){
            bw.write("Statement 11");
            bw.newLine();
            bw.write("Statement 22");
            bw.newLine();
            bw.write("Statement 33");
            bw.newLine();
            System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){
            while(true){
                int i = br.read();
                if(i==-1)
                    break;
                System.out.print((char)i);
            }    
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }

    }
}