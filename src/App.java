import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Integer> bogieCapacities = new HashMap<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Mapping bogies to capacities");

        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 54);
        bogieCapacities.put("First Class", 24);

        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println(entry.getKey() + " capacity: " + entry.getValue());
        }
    }
}
