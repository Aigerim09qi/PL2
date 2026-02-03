import java.util.*;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(List.of("Japan", "Vietnam", "Germany"));
        ArrayList<String> b = new ArrayList<>(List.of("Vietnam", "Italy", "Japan"));

        ArrayList<String> common = new ArrayList<>(a);
        common.retainAll(b);


        System.out.println(common);
    }
}

