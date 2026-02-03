import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>(List.of("Rose", "Peony", "Rose", "Lavender"));

        System.out.println("First: " + flowers.indexOf("Rose"));

        System.out.println("Last: " + flowers.lastIndexOf("Rose"));
    }
}

