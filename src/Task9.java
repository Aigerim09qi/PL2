import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(List.of("Tokyo", "Seoul", "Shanghai"));

        String[] array = cities.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
    }
}
