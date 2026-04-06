import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("=== Train Consist Management App ===");

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removal: " + passengerBogies);

        System.out.println("Does Sleeper exist? " + passengerBogies.contains("Sleeper"));
        System.out.println("Final passenger bogie list: " + passengerBogies);
    }
}
