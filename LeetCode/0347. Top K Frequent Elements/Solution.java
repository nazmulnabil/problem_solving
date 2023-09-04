import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hm.entrySet());

        Comparator<Map.Entry<Integer,Integer>> cmp=new Comparator<Map.Entry<Integer,Integer>> (){
           @Override
           public int compare(Map.Entry<Integer,Integer> entry1,Map.Entry<Integer,Integer> entry2 ){
                 return entry2.getValue().compareTo(entry1.getValue());
           }

        };

        Collections.sort(list, cmp);

        for(int i=0;i<k;i++){
          res[i] =list.get(i).getKey();
      
        }
        return res;
    }
}