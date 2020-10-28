import java.util.HashMap;
import java.util.Map;

/**
 * @author:付文杰
 * @date :2020/10/28 20:50
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 2);
        map.put(3, 2);
        for (int i : map.values()) {
            System.out.println(i);
        }
    }
}
