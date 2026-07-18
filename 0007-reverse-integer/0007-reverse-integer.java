class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;

            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;
    }
}

class main{
    public static void main(String args[]){
        Solution a = new Solution();
        int ans= a.reverse(123);
        if (ans > 2147483647 && ans < -2147483648) {
        System.out.println("0");
    } else {
       System.out.println(ans);
    }
        System.out.println(ans);
    }
}