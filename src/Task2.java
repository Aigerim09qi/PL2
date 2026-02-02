import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Titanic");
        movies.add("Cars");
        movies.add("Interstellar");

        String longest = movies.get(0);
        for (String m : movies) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }
        System.out.println("Longest: " + longest);
    }
}
