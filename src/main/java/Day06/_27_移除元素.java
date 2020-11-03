package Day06;

/**
 * @author:付文杰
 * @date :2020/11/3 18:08
 */
public class _27_移除元素 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
