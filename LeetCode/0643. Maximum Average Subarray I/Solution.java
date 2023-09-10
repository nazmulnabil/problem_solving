class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE,windowSum=0.0;
        
        for( int i=0;i<k;i++){
          windowSum+=nums[i];
        }
        max=Math.max(max, windowSum);

        for(int i=k;i<nums.length;i++){
         windowSum=windowSum+nums[i]-nums[i-k];
         max=Math.max(max, windowSum);

        }

        return max/k;
    }
}