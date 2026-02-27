import java.util.*;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "John", "Alex");

        names.forEach(System.out::println);
    }
}