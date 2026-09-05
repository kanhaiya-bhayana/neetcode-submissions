class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        Queue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(b[1], a[1]));

        for (int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            pq.offer(new int[]{it.getKey(),it.getValue()});
        }

        int[] res = new int[k];
        int i=0;

        while (k--> 0){
            res[i++] = pq.poll()[0];
        }

        return res;
    }
}
