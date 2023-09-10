class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hm = new HashMap<>();
         char ch='/';
         for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
         }
         
         for(Map.Entry<Character,Integer> entry : hm.entrySet()){
                    
                    if(entry.getValue()==1)
                     ch=entry.getKey();
                  
         }

         if(ch=='/')
            return -1;
         for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch)
             return j;
         }
        
    }
}