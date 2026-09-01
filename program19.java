import java.util.*;

class RemoveDuplicatesOrder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int n : arr) {
            set.add(n);
        }

        System.out.println("Result: " + set);
    }
}