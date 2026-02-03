import java.util.*;

public class Task12 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Lily", "Kit", "Juvia", "Eva"));

        names.removeIf(n -> n.length() % 2 == 0);

        System.out.println(names);
    }
}

