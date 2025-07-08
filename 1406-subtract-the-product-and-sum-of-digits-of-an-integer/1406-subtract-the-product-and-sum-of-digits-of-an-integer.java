class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int digit = 0;
        while(n != 0){
            digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        System.out.println(digit);
    
        System.out.println(product);
        return (product - sum);
    }
}