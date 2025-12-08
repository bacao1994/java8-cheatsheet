import java.util.function.Function;

public class Practice15_LambdaWithFunction {
    public static void main(String[] args) {
        Function<String, Integer> length = String::length;
        System.out.println(length.apply("hello"));
    }
}
