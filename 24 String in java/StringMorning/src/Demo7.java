
import java.util.StringJoiner;
public class Demo7 {
    public static void main(String[] args) {
        /*
        StringJoiner sj = new StringJoiner("-");
        sj.add("09");
        sj.add("06");
        sj.add("2025");
        System.out.println("Date : "+sj);
        */
        String str = String.join("-", "09","06","2025");
        System.out.println("Date : "+str);
    }
}
