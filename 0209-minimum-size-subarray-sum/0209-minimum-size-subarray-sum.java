class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left=0;
      int sum=0;
      int length=Integer.MAX_VALUE;
      for(int right=0;right<nums.length;right++){
        sum = sum+nums[right];
        while(sum>=target){
            int minlen=right-left+1;
            length=Math.min(length,minlen);
            sum = sum-nums[left];
            left++;
        }
      }
      return length==Integer.MAX_VALUE?0:length;
    }
}