// Example showing the concept of Predicate
import java.util.function.Predicate;
class Demo9{
    public static void main(String args[]){
        // Predicate<Integer> lessThan = i -> {
        //      System.out.println("Hello");
        //      return i<10;
        //     };

        Predicate<Integer> lessThan = i -> i<10;
        System.out.println("test : "+lessThan.test(100));
        System.out.println("test negate : "+lessThan.negate().test(100));
        
        Predicate<Integer> greaterThan = i -> i>10;
        System.out.println("test : "+greaterThan.test(100));

        System.out.println("test and : "+greaterThan.and(lessThan).test(50));
        System.out.println("test or : "+greaterThan.or(lessThan).test(50));

        Predicate<String> str = Predicate.isEqual("Andrew");
        System.out.println("isEqual : "+str.test("Andrew"));
    }
}

