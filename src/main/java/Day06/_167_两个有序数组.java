package Day06;

/**
 * @author:付文杰
 * @date :2020/11/3 17:51
 */
public class _167_两个有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int[] res = new int[2];
        while (i <= j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target)
                return new int[]{i + 1, j + 1};
            else if (sum > target)
                j--;
            else {
                i++;
            }

        }

        return new int[]{-1, -1};
    }
}
