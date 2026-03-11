class Solution {
    public int totalFruit(int[] f) {
        int i = 0, j = 0;
        int n = f.length;
        int max = 0;


        HashMap<Integer, Integer> mp = new HashMap<>();

        while(j < n){
            mp.put(f[j], mp.getOrDefault(f[j],0) + 1);

            while(mp.size() > 2){
                mp.put(f[i],mp.get(f[i]) - 1);

                if(mp.get(f[i]) == 0){
                    mp.remove(f[i]);
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}