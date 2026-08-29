class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indices.containsKey(target-nums[i])) {
                int[] sol = new int[2];
                sol[0] = indices.get(target-nums[i]);
                sol[1] = i;
                return sol;
            }
            indices.put(nums[i], i);
        }
        return null;
    }
}
