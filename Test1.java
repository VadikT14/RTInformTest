import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> result = countNumbers(array);
        System.out.println(result);
    }

    public static Map<Integer, Integer> countNumbers(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        return map;
    }
}
