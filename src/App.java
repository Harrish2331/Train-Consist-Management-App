import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<String> consist = new LinkedList<>();

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Building ordered train consist");

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial consist: " + consist);

        consist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + consist);

        consist.removeFirst();
        consist.removeLast();

        System.out.println("Final ordered train consist: " + consist);
    }
}
