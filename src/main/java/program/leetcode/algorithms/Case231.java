package program.leetcode.algorithms;

/**
 * leetcode第231题
 * 2的幂
 */
public class Case231 {

    public static boolean isPowerOfTwo(int n) {
        if (n<=0) {
            return false;
        }
        String s = Integer.toBinaryString(n);
        s = s.substring(1, s.length());
        boolean result = true;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '1') {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
}
