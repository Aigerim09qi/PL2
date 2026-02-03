import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange", "Banana"));

        fruits.removeIf(f -> f.equals("Banana"));

        System.out.println(fruits);
    }
}

