class Solution {
    public int romanToInt(String s) {
        String roman = s.toUpperCase();
        int sum = 0 ;
        int i=0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        while(i<s.length()-1){
            if(map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))){
                sum = sum + (map.get(roman.charAt(i+1))-map.get(roman.charAt(i))) ;
                i++;
            }
            else{ 
                sum = sum + map.get(roman.charAt(i));
            }
            i++;
        }
        if(i==s.length()-1){
            sum = sum + map.get(roman.charAt(i));
        }
           return sum;
    }
}
class main{
    public static void main(String args[]){
        Solution a = new Solution();
        int n = a.romanToInt("III");
        System.out.println(n);
    }
}