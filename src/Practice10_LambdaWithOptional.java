import java.util.Optional;

public class Practice10_LambdaWithOptional {
    public static void main(String[] args) {
        // Valid
        Optional<String> optional = Optional.of("Java");
        optional.ifPresent(System.out::println);

        // valid
        Optional<String> optional2 = Optional.ofNullable("Golang");
        optional2.ifPresent(System.out::println);

        // in valid: Optional.ofNullable(null) -> Optional.empty()
        Optional<String> optional3 = Optional.ofNullable(null);
        optional3.ifPresent(System.out::println);

        // in valid
        Optional<String> optional4 = Optional.empty();
        optional4.ifPresent(System.out::println);

    }
}
