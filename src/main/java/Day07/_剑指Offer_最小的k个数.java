package Day07;

import java.util.Arrays;

/**
 * @author:付文杰
 * @date :2020/11/4 17:30
 */
public class _剑指Offer_最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
