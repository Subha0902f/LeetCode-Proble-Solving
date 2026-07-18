class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index_1=0;
        int index_2=0;
        outerloop:
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                     index_1=i;
                     index_2=j;
                    break outerloop;
                }
            }
        }
       return new int[] {index_1,index_2};
}
}
class Main {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;

    Solution a = new Solution();
    a.twoSum(nums,target);
    }
    }