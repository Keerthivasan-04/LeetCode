class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        while(!visit.contains(n)){
            visit.add(n);
            n = findHappy(n);
            if(n == 1){
                return true;
            }

        }
        return false;
        
    }
    private int findHappy(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}