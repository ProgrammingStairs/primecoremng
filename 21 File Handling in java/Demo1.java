// program showing the concept of file handling in java
import java.io.File;
class Demo1{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Folder created successfully");
        }else{
            System.out.println("Folder Already Exist");     
        }
    }
}