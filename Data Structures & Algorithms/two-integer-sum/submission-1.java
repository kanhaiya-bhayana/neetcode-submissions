class Solution {
    public int[] twoSum(int[] nums, int k) {
        int i=0;
        int n=nums.length-1;
        int res = Integer.MIN_VALUE;

        Map<Integer, Integer> map = new HashMap<>();

        for (; i<=n; i++){
            int diff = k - nums[i];
            if (map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{i,res};
    }
}
