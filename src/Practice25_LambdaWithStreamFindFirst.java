import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practice25_LambdaWithStreamFindFirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "John", "Alice");

        Optional<String> first = names.stream().findFirst();
        first.ifPresent(System.out::println);
    }
}
