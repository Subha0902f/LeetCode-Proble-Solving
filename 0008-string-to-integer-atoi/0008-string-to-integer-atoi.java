class Solution {
    public int myAtoi(String s) {
           //first remove the spaces
           int i=0;
           while(i<s.length() && s.charAt(i)==' '){
            i++;
           }
           //Check for the sign
           int sign=1;
           if(i<s.length() && s.charAt(i)=='-'){
            sign = -1;
            i++;
           }
           else if(i<s.length() && s.charAt(i)=='+'){
            i++;
           }
            int nums=0;
           //Check if the next index consists a number or not
           while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0' ;
            if(nums>(Integer.MAX_VALUE-digit)/10){
                return sign==1? Integer.MAX_VALUE:Integer.MIN_VALUE ;
            }
            nums = nums*10 + digit;
            i++;
    }
    return nums*sign;
}
}