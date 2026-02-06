class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];
        return nums;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 2, 3, 4};   
        int[] result = obj.runningSum(nums);

        
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
