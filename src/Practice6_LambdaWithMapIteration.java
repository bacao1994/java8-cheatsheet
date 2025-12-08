import java.util.HashMap;
import java.util.Map;

public class Practice6_LambdaWithMapIteration {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Kato", "100");
        map.put("Nick", "50");
        map.put("Thomas", "98");

        map.forEach((String k, String v) -> {
            System.out.println(k + " : " + v);
        });
    }
}
