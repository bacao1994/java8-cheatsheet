import java.util.Arrays;
import java.util.List;

public class Practice23_LambdaWithStreamAllMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);

        boolean allMatch = numbers.stream().allMatch(number -> number > 0);
        System.out.println(allMatch);
    }
}
