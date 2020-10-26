package Day03;

/**
 * @author:付文杰
 * @date :2020/10/26 20:32
 */
public class MyUtil {
    static void printArr(int[] arr) {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]);
            s.append(i != arr.length - 1 ? "," : "]");
        }
        System.out.println(s.toString());
    }
}
