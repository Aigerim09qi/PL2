import java.util.*;

public class Task20 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>(List.of("Thoma", "Barbara"));
        ArrayList<String> hr = new ArrayList<>(List.of("Bennet", "Navia"));

        departments.add(it);
        departments.add(hr);

        for (ArrayList<String> dep : departments) {

            System.out.println(dep);
        }
    }
}

