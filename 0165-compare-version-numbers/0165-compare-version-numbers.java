class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int length = Math.max(v1.length, v2.length);
        
        for (int i = 0; i < length; i++) {
            Integer num1 = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            Integer num2 = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;
            
            int compare = num1.compareTo(num2);
            if (compare != 0) {
                return compare;
            }
        }
        
        return 0;
    }
}