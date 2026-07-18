class Solution {
    public boolean isPalindrome(int x) {
        int r=x;
        int sum=0;
        while(r>0){
            int rem = r%10;
            sum = sum*10+rem;
            r=r/10;
        }
        return sum==x;
    }
}
class main{
    public static void main(String args[]){
        Solution a = new Solution();
        boolean ans = a.isPalindrome(121);
    }
}