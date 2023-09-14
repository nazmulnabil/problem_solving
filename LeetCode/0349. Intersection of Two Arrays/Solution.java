import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set =new HashSet<>();
        Set<Integer> intersectionSet =new HashSet<>();

        int len1=nums1.length;
        int len2=nums2.length;

        for(int i=0;i<len1;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<len2;j++){
            if(set.contains(nums2[j]))
            intersectionSet.add(nums2[j]);
        }
        List<Integer> list=new ArrayList<>(intersectionSet);
        int [] res=new int[list.size()];
        
        for(int k=0;k<list.size();k++){
            res[k]=list.get(k);
        }
      
        return res;
    }
}