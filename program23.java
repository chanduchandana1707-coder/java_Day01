import java.util.*;

class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicate = new LinkedHashSet<>();

        for (int n : arr) {
            if (!seen.add(n)) {
                duplicate.add(n);
            }
        }

        System.out.println("Duplicate elements: " + duplicate);
    }
}