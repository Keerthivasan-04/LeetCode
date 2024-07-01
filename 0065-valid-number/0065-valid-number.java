class Solution {
    public boolean isNumber(String s) {
        // if(s==null || s.isEmpty()){
        //     return false;
        // }
        // if (s.equals("Infinity") || s.equals("-Infinity")|| s.equals("+Infinity")) {
        //     return false;
        // }
        if(s.matches(".*[a-df-zA-DF-Z].*")){
            return false;
        }
        boolean n = true;

        try{
            Double sum = Double.parseDouble(s);
        }
        catch(NumberFormatException e){
            return false;
        }
        if(n)
        return true;
        else
        return false;
    }
}