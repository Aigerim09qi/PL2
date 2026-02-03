import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("Traveler", "Water", "Book"));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[AEIOUaeiou]", "*"));
        }


        System.out.println(words);
    }
}
