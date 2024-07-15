class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> l = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!l.add(nums[i]))
            {
                return true;
            }
        }
        return false;
    }
}