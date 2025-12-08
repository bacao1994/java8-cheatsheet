import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice21_LambdaWithStreamCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "John", "Alice");

        long countAlice = names.stream()
                .filter(name -> name.equals("Alice"))
                .count();
        System.out.println(countAlice);
    }
}
