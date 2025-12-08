import java.util.Arrays;
import java.util.List;

public class Practice18_LambdaWithStreamReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer result = list.stream().reduce(0, Integer::sum);

        System.out.println(result);
        // ------------------------------------------------
        List<Integer> list1 = Arrays.asList(5, 3, 9, 1, 7);

        Integer max = list1.stream()
                .reduce(Integer::max)
                .orElse(null);

        System.out.println(max);


    }
}
