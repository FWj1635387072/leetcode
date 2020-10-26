package Day03;

/**
 * @author:付文杰
 * @date :2020/10/26 20:13
 */
public class _1365_多少个小于当前数字的数 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] res = smallerNumbersThanCurrent(arr);
        MyUtil.printArr(res);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[101];
        for (int i = 0; i < nums.length; i++)
            temp[nums[i]]++;

        int[] res = new int[nums.length];
        int t1 = 0, t2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                t1 = temp[i];
                temp[i] = t2;
                t2 = t1 + t2;
            }
        }
        for (int i = 0; i < nums.length; i++)
            res[i] = temp[nums[i]];
        return res;
    }

}
