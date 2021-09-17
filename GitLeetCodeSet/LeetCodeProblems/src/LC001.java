public class LC001 {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
