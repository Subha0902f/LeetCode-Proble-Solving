class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
      for(int i=0;i<nums.length;i++){
         if(i>0 && nums[i]==nums[i-1]){
            continue;
         }
        for(int j=nums.length-1;j>i;j--){
            if(j<nums.length-1 && nums[j]==nums[j+1]){
            continue;
         }
         int left = i+1;
         int right = j-1;
         while(left<right){
            long sum = (long) nums[i] + nums[left] + nums[right] + nums[j];
            if(target==sum){
                arr.add(Arrays.asList(nums[i], nums[left], nums[right], nums[j]));
                 left++;
                 right--;
                 while(left < right && nums[left] == nums[left - 1]){
    left++;
}

while(left < right && nums[right] == nums[right + 1]){
    right--;
}
            }
            else if(target>sum){
                left++;
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
            }
            else{
                right--;
                while(left<right && nums[right]==nums[right+1]){
                    right--;
                }
            }
         }
        }
      }
      return arr;
    }
}