import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length+nums2.length;
        int index;
        double median;
        int c[] = new int[sum];
               for(int i=0;i<nums1.length;i++){
                c[i] = nums1[i];
               }
               int k = nums1.length ;
               for(int j=0;j<nums2.length;j++){
                c[k] = nums2[j];
                k++;
               }
               Arrays.sort(c);
               if(sum%2==0){
                 index = sum/2 ;
                   median = ((double)c[index] + (double)c[index-1])/2 ;
               }
               else{
                 index = sum/2 ;
                 median = c[index];
               }
               return median;
        }
}
class Main{
    public static void main(String[] args){
        Solution s = new Solution();
       double x = s.findMedianSortedArrays(new int[]{1,3},new int[]{2});
       System.out.println(x);
    }
}