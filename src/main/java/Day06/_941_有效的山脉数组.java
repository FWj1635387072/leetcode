package Day06;

/**
 * @author:付文杰
 * @date :2020/11/3 16:27
 */
public class _941_有效的山脉数组 {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3)
            return false;
        int i = 0;
        while (i < A.length - 1) {
            if (A[i] < A[i + 1])
                i++;
            else
                break;
        }
        if (i == A.length - 1 || i == 0) {
            return false;
        }

        while (i < A.length - 1) {
            if (A[i] > A[i + 1])
                i++;
            else
                return false;
        }
        return true;
    }


}
