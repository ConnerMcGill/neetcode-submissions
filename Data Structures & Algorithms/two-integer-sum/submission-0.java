class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (seen.containsKey(result)) {
                return new int[] {seen.get(result), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[] {0, 0};
    }
}
