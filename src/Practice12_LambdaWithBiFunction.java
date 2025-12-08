import java.util.function.BiFunction;

public class Practice12_LambdaWithBiFunction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> myFunction = (x, y) -> "Tổng là: " + (x + y);
        System.out.println(myFunction.apply(4,5));
    }
}
