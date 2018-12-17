package program.leetcode.dataStructure;

public class Case1 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++) {
                if ((nums[i]+nums[j]) == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(twoSum(nums, target)[0]);
        System.out.println(twoSum(nums, target)[1]);
    }

}
