class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(hp.containsKey(nums[i])){
                hp.put(nums[i],hp.get(nums[i]) + 1);
            }
            else{
                hp.put(nums[i], 1);
            }
        }
        int s = 0;

        for(Map.Entry<Integer, Integer> mp : hp.entrySet()){
            if(mp.getValue() > nums.length / 2){
                s =  mp.getKey();
            }
        }
        return s;
    }
}