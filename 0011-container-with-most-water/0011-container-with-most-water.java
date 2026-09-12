class Solution {
    public int maxArea(int[] height) {
         int maxarea=0;
         int left=0;
         int right=height.length-1;
       while(left<right){
        int width = right-left;
        int ht = Math.min(height[left],height[right]);
        int area = width * ht;
        maxarea = Math.max(maxarea,area);
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return maxarea;
    }
}