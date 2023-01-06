public class LeetCode_396 {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int sumIndexing = 0;
        int index = 0;

        for (int num : nums) {
            sumIndexing += num * index;
            sum += num;
            index++;
        }

        int last = sumIndexing;

        int ans = last;
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, last + sum - nums.length * nums[nums.length - i]);
            last = last + sum - nums.length * nums[nums.length - i];
        }

        return ans;
    }
}
