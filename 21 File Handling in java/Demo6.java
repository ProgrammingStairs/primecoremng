// program showing the concept of file handling in java
import java.util.Scanner;
import java.io.*;
class Demo6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Content : ");
        String str = sc.nextLine();

        File file1 = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile1.txt");
        File file2 = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\newfile2.txt");
        
        try(FileOutputStream fout1 = new FileOutputStream(file1,true);
        FileOutputStream fout2 = new FileOutputStream(file2,true);
        ByteArrayOutputStream bout = new ByteArrayOutputStream();){
            byte bt[] = str.getBytes();
            bout.write(bt);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            System.out.println("Data Inserted Successfully");
        }catch(IOException e){
            System.out.println("Error while dealing with a file : "+e);
        }
    }
}