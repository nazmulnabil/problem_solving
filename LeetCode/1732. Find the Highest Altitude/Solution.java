import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    public int largestAltitude(int[] gain) {
         List<Integer> prefixList=new ArrayList<>();
         int prefixSum=0;
         prefixList.add(prefixSum);

         for(int i=0;i<gain.length;i++){
            prefixSum+= gain[i];
            prefixList.add(prefixSum);
         }
         Collections.sort(prefixList);
         return prefixList.get(prefixList.size()-1);

    }
}