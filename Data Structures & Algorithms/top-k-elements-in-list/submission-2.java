class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        Queue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            pq.offer(new int[]{it.getKey(),it.getValue()});
            if (pq.size() > k){
                pq.poll();
            }
        }

        int[] res = new int[k];
        for (int i=0; i<k; i++){
            res[i] = pq.poll()[0];
        }

        return res;
    }
}
