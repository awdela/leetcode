package program.leetcode.dataStructure;

import java.util.HashSet;
import java.util.Set;

/**
 * leetcode第3题
 * 无重复字符的最长子串
 * 使用滑动窗口
 */
public class Case3 {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<Character>();
        int currentMax = 0;
        int n = s.length();
        int i = 0, j = 0;
        while (i<n && j<n) {
            if (!window.contains(s.charAt(j))) {
                currentMax = Math.max(currentMax, window.size());
                window.remove(i);
                i = j+1;
                j++;
            }else {
                window.add(s.charAt(i++));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abacdsaegh"));
    }

}
