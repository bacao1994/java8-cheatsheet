import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice20_LambdaWithStreamSorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 1, 4, 2, 4, 5);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
