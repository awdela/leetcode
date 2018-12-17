package program.leetcode.algorithms;

/**
 * leetcode第239题
 * 滑动窗口最大值
 *
 */
public class Case239 {

    /**
     * 时间复杂度为O(n^2),不建议采纳
     */
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        if (k==1 || nums.length==0) {
            return nums;
        }
        int[] result = new int[nums.length-k+1];
        for (int i=0;i<=nums.length-k;i++) {
            int currentMax = nums[i];
            for (int j=i;j<i+k;j++) {
                if (nums[j]>currentMax) {
                    currentMax = nums[j];
                }
            }
            result[i] = currentMax;
        }
        return result;
    }

    /**
     * 使用双端队列Deque
     */
//    public static int[] maxSlidingWindow(int[] nums, int k) {
//        Deque<Integer> window = new LinkedList<Integer>();
//    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,7,3,6,12,4,9,4,6};
//        int[] result = maxSlidingWindow(nums, 3);
//        for (int i:result) {
//            System.out.println(i);
//        }
    }

}
