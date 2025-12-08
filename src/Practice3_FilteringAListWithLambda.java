import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3_FilteringAListWithLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredList = list
                .stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        list.forEach(System.out::print);
        System.out.println();
        filteredList.forEach(System.out::print);

    }
}
