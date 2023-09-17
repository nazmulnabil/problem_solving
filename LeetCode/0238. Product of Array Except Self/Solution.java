class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productArr = new int[nums.length];
        int[] prefixArr = new int[nums.length];

        int prouctMultiply=1;
        for(int i=0;i<nums.length;i++){

             for(int j=0;j<nums.length;j++){
                if(j!=i)
                prouctMultiply*=nums[j];
             }
             prefixArr[i]=prouctMultiply;
             prouctMultiply=1;
       

        }
  
        return prefixArr;
    }
}