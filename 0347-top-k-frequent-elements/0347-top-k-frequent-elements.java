class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> num = new HashMap<>();
        for (int n : nums)
            num.put(n, num.getOrDefault(n, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> top= new PriorityQueue<>(
                (e1, e2) -> e1.getValue() - e2.getValue());

        
        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
            top.add(entry);
            if (top.size() > k) {
                top.poll();
            }
        }

        
        int[] res = new int[k];

        int i = 0;
        while (!top.isEmpty()) {
            res[i] = top.poll().getKey();
            i++;
        }

        return res;
    }
}