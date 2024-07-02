class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []hp1=new int [1001];
        int []hp2=new int  [1001];
    for(int i=0;i<n1;i++)
    {
        hp1[nums1[i]]++;
    }
    for(int i=0;i<n2;i++){
        hp2[nums2[i]]++;
    }
    ArrayList<Integer> arr = new ArrayList<Integer>();

    for(int i=0;i<1001;i++){
        if(hp1[i]!=0 && hp2[i]!=0){
            int c = Math.min(hp1[i],hp2[i]);
            while(c!=0){
                arr.add(i);
                c--;
            }
        }
    }
    int m = arr.size();
    int [] result = new int[m];
    for(int i=0;i<m;i++){
        result[i] = arr.get(i);
    }
        return result;
    }
}