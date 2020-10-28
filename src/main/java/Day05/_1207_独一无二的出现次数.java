package Day05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author:付文杰
 * @date :2020/10/28 20:40
 */
public class _1207_独一无二的出现次数 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map.size() == new HashSet<>(map.values()).size();

    }
}
