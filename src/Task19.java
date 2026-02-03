import java.util.*;

public class Task19 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Pear","Lemon","Orange"));

        ArrayList<Integer> lengths = new ArrayList<>();
        for (String f : fruits) {
            lengths.add(f.length());
        }


        System.out.println(lengths);
    }
}

