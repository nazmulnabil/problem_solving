import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
         Arrays.sort(nums);
        int c=0,left=0,right=nums.length-1;;
         

          while(left<right){
      
               if((nums[left]+nums[right])==k){
                c++;
                left++;
                right--;
               }
               else if((nums[left]+nums[right])<k)
               left++;
               else
               right--;
          }
        return c;
    }
}