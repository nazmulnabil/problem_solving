import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 =new HashSet<Integer>();
        Set<Integer> set2 =new HashSet<Integer>();
        List<Integer> uniqueList1=new ArrayList<>();
        List<Integer> uniqueList2=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();


        for(int i=0;i<num1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<num2.length;j++){
            set2.add(nums2[j]);
        }

        for(int k=0;k<nums1.length;k++){
             if(!set2.contains(nums1[k]))
             uniqueList1.add(nums1[k]);
        }

        for(int l=0;l<nums2.length;l++){
            if(!set1.contains(nums2[l]))
            uniqueList2.add(nums2[l]);
       }
        list.add(uniqueList1);
        list.add(uniqueList2);
          
        return list;
    }
}