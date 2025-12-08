import java.util.Optional;
import java.util.function.Supplier;

public class Practice14_LambdaWithSupplier {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello";
        System.out.println(supplier.get());


        Optional<String> optional = Optional.ofNullable(null);
        Supplier<String> defaultSupplier = () -> "Default Value";

        String result = optional.orElseGet(defaultSupplier);
        System.out.println(result); // Output: Default Value
    }

}
