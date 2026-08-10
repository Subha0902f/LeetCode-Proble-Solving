class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg=0, count=0;
       for(int i=0;i<k;i++){
        avg = avg + arr[i] ;
       } 
       if(avg>=threshold*k){
            count++;
       }
      for(int i=k;i<arr.length;i++){
        avg = (avg - arr[i-k] + arr[i]);
        if(avg>=threshold*k){
            count++;
        }
      }
      return count;
}
}