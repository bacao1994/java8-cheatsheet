import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice4_SortingAListUsingLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Golang", "Ruby", "Python", "C");
        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::println);
    }
}
