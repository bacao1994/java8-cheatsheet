import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practice26_LambdaWithStreamFindAny {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Spring", "John", "Alice");

        Optional<String> any = names.stream().findAny();
        any.ifPresent(System.out::println);
    }
}
