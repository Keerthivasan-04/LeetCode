class Solution {
    String[] les = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine","Ten","Eleven","Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};
    String[] tens = {"","","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String[] thous = {"","Thousand", "Million", "Billion"};

    public String numberToWords(int num) {

        if(num == 0)    return "Zero";

        int i = 0;
        String words = "";

        while(num>0){
            if(num%1000 != 0){
                words = help(num%1000) + thous[i] + " " + words;
            }
            num /= 1000;
            i++;
        }
        return words.trim();
    }
        

        public String help(int num){
           if(num == 0) return "";
           else if(num < 20)  return les[num] + " ";
           else if(num < 100) return tens[num/10] + " " + help(num %10);
           else return les[num/100] + " Hundred " + help(num % 100);
        }
}