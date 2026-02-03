import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(List.of("Cat", "Dog", "Cat", "Mouse"));

        Set<String> set = new LinkedHashSet<>(animals);
        animals = new ArrayList<>(set);


        System.out.println(animals);
    }
}

