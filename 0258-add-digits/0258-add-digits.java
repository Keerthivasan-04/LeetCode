class Solution {
    public int addDigits(int num) {

        int value = num;
        while(value > 9){
            int nv = 0, rem;
            while(value != 0){
                rem = value % 10;
                nv += rem;
                value /= 10;
            }
            value = nv;
        }
        return value;
        
    }
}