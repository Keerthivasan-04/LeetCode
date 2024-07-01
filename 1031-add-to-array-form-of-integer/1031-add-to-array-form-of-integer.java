class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList <Integer>();
        int n = num.length;
        int carry = 0;
        int i = n - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                carry += num[i];
            }
            carry += k % 10;
            result.add(carry % 10);
            carry /= 10;
            k /= 10;
            i--;
        }

        if (carry > 0) {
            result.add(carry);
        }

        Collections.reverse(result);
        return result;
    }
}