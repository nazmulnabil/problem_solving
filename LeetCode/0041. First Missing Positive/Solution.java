class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i=0;
        for( i=1;i<=nums.length;i++){
            if(!set.contains(i))
            return i;
        }
        return i;
    }
}