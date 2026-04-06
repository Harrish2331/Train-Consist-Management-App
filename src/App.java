import java.util.LinkedHashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Preserving bogie insertion order");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper");

        System.out.println("Final train formation: " + trainFormation);
    }
}
