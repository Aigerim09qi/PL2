import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>(List.of("Football", "Tennis", "Basketball"));
        ArrayList<String> sub = new ArrayList<>(List.of("Football", "Tennis"));


        System.out.println(sports.containsAll(sub));
    }
}
