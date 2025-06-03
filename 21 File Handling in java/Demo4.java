// program showing the concept of file handling in java
import java.util.Scanner;
import java.io.*;
class Demo4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content : ");
        String str = sc.nextLine();

        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile.txt");
        try(FileOutputStream fout = new FileOutputStream(file,true)){
            byte bt[] = str.getBytes();
            fout.write(bt);
           // fout.close();
            System.out.println("Data Inserted Successfully");
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }
    }
}