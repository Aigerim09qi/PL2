import java.util.*;

public class Task16 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(List.of("Mon","Tue","Wed","Thu","Fri","Sat","Sun"));

        Collections.rotate(days, 2);

        System.out.println(days);
    }
}

