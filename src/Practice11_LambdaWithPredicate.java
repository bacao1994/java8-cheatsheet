import java.util.Objects;
import java.util.function.Predicate;

public class Practice11_LambdaWithPredicate {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s ->  Objects.isNull(s) || s.isEmpty();
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("a"));
        System.out.println(isEmpty.test(null));
    }
}
