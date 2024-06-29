class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> m = new PriorityQueue<>();

        for (int num : nums) {
            m.offer(num); 
            if (m.size() > k) {
                m.poll(); 
            }
        }

        return m.peek();
    }
}