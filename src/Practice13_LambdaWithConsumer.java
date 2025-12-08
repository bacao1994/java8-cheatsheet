import java.util.function.Consumer;

public class Practice13_LambdaWithConsumer {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        print.accept("Hello World");
    }

}
