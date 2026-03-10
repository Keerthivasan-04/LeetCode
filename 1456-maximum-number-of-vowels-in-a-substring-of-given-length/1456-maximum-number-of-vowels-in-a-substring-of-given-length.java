class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;

        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        max = count;

        for(int i = k ; i < s.length(); i++){
            char ch = s.charAt(i - k);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count--;
            }

            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
            max = Math.max(count, max);
        }
        return max;

        // for(int i = 0 ; i <= s.length() - k; i++){
        //     count = 0;
        //     for(int j = i; j < i + k; j++){
        //         char ch = s.charAt(j);
        //         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //             count++;
        //         }
        //     }
        //     max = Math.max(count,max);

        // }
        // return max;
    }
}