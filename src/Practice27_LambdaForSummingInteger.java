import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Practice27_LambdaForSummingInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);

        Integer sum = numbers.stream().mapToInt(x -> x).sum();
        System.out.println(sum);
    }
}
