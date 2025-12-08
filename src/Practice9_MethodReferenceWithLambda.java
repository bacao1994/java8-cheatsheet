import java.util.Arrays;
import java.util.List;

public class Practice9_MethodReferenceWithLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Golang", "Python", "JavaScript");
        list.forEach(System.out::println);
    }
}
