class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] n = new int [2];
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    n[0]=i;
                    n[1]=j;
                    break;
                }
                
            }
        }
     return n;
        
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap <Integer,Integer> h = new HashMap<> ();

//         for(int i=0;i<nums.length;i++){

//             if(h.containsKey(target - nums[i])){
//                 return new int[]{h.get(target - nums[i]),i};
//             }
           
//             h.put(nums[i],i);
            
//         }
//         return new int[]{-1 , -1};
//     }
// }