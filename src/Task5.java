import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Pink", "Blue", "Brown"));

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }

        System.out.println(colors);
    }
}
