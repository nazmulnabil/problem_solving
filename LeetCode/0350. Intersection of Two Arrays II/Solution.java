import java.util.List;
import java.util.Set;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set =new HashSet<>();
        int len1=nums1.length;
        int len2=nums2.length;
        int lenMin=Math.min(len1, len2);
        int lenMax=Math.max(len1, len2);
        
        List<Integer> list =new ArrayList<>();
        List<Integer> inersectionlist =new ArrayList<>();

        for(int i=0;i<len1;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<len2;j++){
            if(set.contains(nums2))
            list.add(nums2[j]);
        }
        if(len1>len2){
            for(int k=0;k<len1;k++){
                if(list.contains(nums1[k]))
                inersectionlist.add(nums1[k]);
            }
        }
        else{
            for(int k=0;k<len2;k++){
                if(list.contains(nums2[k]))
                inersectionlist.add(nums2[k]);
            }
        }
       int[] res=new intinersectionlist.size();
       for(int l=0;l<intinersectionlist.size();l++){
        res[i]=intinersectionlist.get(l);
       }

    
        return res;
    }
}