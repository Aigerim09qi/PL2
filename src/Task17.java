import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Miko", null, "Kuki", null));

        students.removeIf(s -> s == null);

        System.out.println(students);
    }
}

