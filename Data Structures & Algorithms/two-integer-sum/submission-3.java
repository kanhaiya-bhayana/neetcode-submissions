class Solution {
    public int[] twoSum(int[] nums, int k) {
        int n=nums.length-1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<=n; i++){
            int diff = k - nums[i];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE};
    }
}
