import java.util.Arrays;
import java.util.List;

public class Practice22_LambdaWithStreamAnyMatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "John", "Alice");

        boolean hasJava = names.stream().anyMatch(name -> name.contains("Java"));
        System.out.println(hasJava);
    }
}
