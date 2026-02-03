import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(List.of("Book A", "Book B", "Book C"));
        ArrayList<String> b = new ArrayList<>(List.of("Book B", "Book D"));

        Set<String> set = new LinkedHashSet<>();
        set.addAll(a);
        set.addAll(b);

        ArrayList<String> result = new ArrayList<>(set); // is

        System.out.println(result);
    }
}

