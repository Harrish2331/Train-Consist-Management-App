import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    static class Bogie {
        private final String name;
        private final int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " - " + capacity;
        }
    }

    public static void main(String[] args) {
        List<Bogie> passengerBogies = new ArrayList<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Sorting bogies by capacity");

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 24));

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));
        System.out.println("Bogies sorted by capacity: " + passengerBogies);
    }
}
