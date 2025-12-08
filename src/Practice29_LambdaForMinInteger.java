import java.util.Arrays;
import java.util.List;

public class Practice29_LambdaForMinInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 1);

        Integer min = numbers.stream().mapToInt(x -> x).min().orElse(Integer.MAX_VALUE);
        System.out.println(min);
    }
}
