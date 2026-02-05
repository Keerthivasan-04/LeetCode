class Solution {
    public int removeElement(int[] arr, int val) {
        int l = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[l] = arr[i];
                l++;
            }
        }
        return l;
    }
}