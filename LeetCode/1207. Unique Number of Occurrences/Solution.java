import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm=new HashMap<>();
        Set<Integer,Integer> set =new HashSet();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
            
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
          set.add(entry.getValue());

        }
                 if(set.size()!=hm.size())
                 return false;    
           return true;       
    }
}