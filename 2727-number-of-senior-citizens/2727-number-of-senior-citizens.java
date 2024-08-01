class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(String d : details){
            int a = Integer.parseInt(d.substring(11,13));
            if(a > 60){
                c++;
            }
        }
        return c;
    }
}


// class Solution {
//     public int countSeniors(String[] details) {
//         int c = 0;
//         for(int i = 0; i < details.length; i++){
//             if(details[i].charAt(11) - '0' == 6 && details[i].charAt(12) - '0' >= 1){
//                 c++;
//             }
//             else if(details[i].charAt(11)-'0' > 6){
//                 c++;
//             }
//         }
//         return c;
//     }
// }