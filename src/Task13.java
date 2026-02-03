import java.util.*;

public class Task13 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(List.of("Runaway", "Doubt", "Reflections"));

        String shortest = songs.get(0);
        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        System.out.println("Shortest: " + shortest);
    }
}

