import java.util.Arrays;
import java.util.List;

public class Practice19_LambdaWithStreamDistinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 4, 2, 4, 5);

        list.stream().distinct().forEach(System.out::println);


    }
}
