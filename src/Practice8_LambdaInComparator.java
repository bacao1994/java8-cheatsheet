import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice8_LambdaInComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Golang", "Python", "JavaScript");
        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
