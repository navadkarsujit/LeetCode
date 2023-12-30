class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case when array is empty

        int uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Move unique elements to the front
                uniqueCount++; // Increment count for unique elements
            }
        }
        return uniqueCount;
    }
}
