import java.util.function.BinaryOperator;

public class Practice17_LambdaWithBinaryOperator {
    public static void main(String[] args) {
        BinaryOperator<Integer> square = (x, y) -> x * y;
        System.out.println(square.apply(5, 6));
    }
}
