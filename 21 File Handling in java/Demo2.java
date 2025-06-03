// program showing the concept of file handling in java
import java.io.File;
import java.io.IOException;
class Demo2{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java\\MyFolder\\file.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("File created successfully");
            }else{
                System.out.println("File Already Exist");     
            }
        }catch(IOException e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}