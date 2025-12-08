import java.util.Arrays;
import java.util.List;

public class Practice24_LambdaWithStreamNoneMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);

        boolean noneMatch = numbers.stream().noneMatch(number -> number % 2 != 0);
        System.out.println(noneMatch);
    }
}
