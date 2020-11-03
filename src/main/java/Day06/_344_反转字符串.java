package Day06;

/**
 * @author:付文杰
 * @date :2020/11/3 17:29
 */
public class _344_反转字符串 {
    public void reverseString(char[] s) {
        int front = 0, last = s.length - 1;
        char temp;
        while (front < last) {
            temp = s[front];
            s[front] = s[last];
            s[last] = temp;
            front++;
            last--;
        }

    }
}
