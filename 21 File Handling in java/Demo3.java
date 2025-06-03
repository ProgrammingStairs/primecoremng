// program showing the concept of file handling in java
import java.io.File;
import java.io.IOException;
class Demo3{
    public static void main(String args[]){
        File file = new File("D:\\Prime Step\\primecoremng\\21 File Handling in java");
        File frr[] = file.listFiles();
        for(File fobj : frr){
            // System.out.println(fobj.getName());
            
            if(fobj.getName().endsWith(".java"))
                System.out.println(fobj.getName());

        }
    }
}