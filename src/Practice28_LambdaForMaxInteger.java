import java.util.Arrays;
import java.util.List;

public class Practice28_LambdaForMaxInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 1, 9, 4, 6);

        Integer max = numbers.stream().mapToInt(x -> x).max().orElse(Integer.MIN_VALUE);
        System.out.println(max);
    }
}
