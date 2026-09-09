class Solution {
    public int[] twoSum(int[] arr, int k) {
        int i=0;
        int j=arr.length-1;

        while (i < j){
            if (arr[i] + arr[j] < k) i++;
            else if (arr[i] + arr[j] > k) j--;
            else return new int[]{i+1, j+1};
        }

        return new int[]{-1,-1};
    }
}
