import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> bogieIds = new HashSet<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Tracking unique bogie IDs");

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101");
        bogieIds.add("BG103");
        bogieIds.add("BG102");

        System.out.println("Unique bogie IDs in the train: " + bogieIds);
    }
}
