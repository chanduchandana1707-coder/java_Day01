import java.util.*;

class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeated character: " + ch);
                break;
            }
        }
    }
}