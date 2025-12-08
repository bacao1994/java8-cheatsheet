
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class Practice5_UsingACustomFunctionalInterface {
    public static void main(String[] args) {
        Calculator add = Integer::sum;
        Calculator multiply = (a, b) -> a * b;

        Integer sum = add.calculate(2, 3);
        Integer multiplication = multiply.calculate(5, 6);

        System.out.println(sum);
        System.out.println(multiplication);
    }
}
