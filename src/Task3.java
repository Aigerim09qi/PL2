import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>(List.of("Pizza", "Burger", "Pizza", "Salad"));

        int count = 0;
        for (String f : foods) {
            if (f.equals("Pizza")) count++;
        }

        System.out.println("Pizza count = " + count);
    }
}
