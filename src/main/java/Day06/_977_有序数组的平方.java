package Day06;

/**
 * @author:付文杰
 * @date :2020/11/3 17:39
 */
public class _977_有序数组的平方 {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        for (int i = 0, j = A.length - 1, pos = A.length - 1; i <= j; ) {
            if (A[i] * A[i] > A[j] * A[j]) {
                res[pos] = A[i] * A[i];
                i++;
            } else {
                res[pos] = A[j] * A[j];
                j--;
            }
            pos--;
        }
        return res;
    }

}
