import java.util.Arrays;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int left=0,right=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        
        while(left<nums1.length && right<nums2.length){
            
             if(nums1[left]==nums2[right]){
                list.add(nums1[left]);
                left++;
                right++;
             }
             else if(nums1[left]<nums2[right]){
                left++;
             }
             else if(nums2[right]<nums1[left]){
                right++;
             }
         }

        int[] res=new int[list.size()];

        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        
        return res;
    }
}