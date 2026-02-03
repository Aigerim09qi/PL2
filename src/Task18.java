import java.util.*;

public class Task18 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(List.of("Up", "Jumanji", "Moana", "Dune"));

        movies.sort((a,b) -> b.length() - a.length());

        System.out.println("Second longest: " + movies.get(1));
    }
}

