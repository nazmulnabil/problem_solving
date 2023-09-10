class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
         int i=0,len1=word1.length(),len2=word2.length();
          
         if(len1 > len2){
             for( i=0;i<word1.length();i++){
                 if(i>=word2.length())
                 break;
                 res+=word1.charAt(i);
                 res+=word2.charAt(i);
              
                 }  
                 while(i<word1.length())
                  {res+=word1.charAt(i);
                    i++;
                  }
                
                                    
            } 
         else{

            for( i=0;i<word2.length();i++){
                if(i>=word1.length())
                break;
                res+=word1.charAt(i);
                res+=word2.charAt(i);
             
                }  
                while(i<word2.length())
                 {res+=word2.charAt(i);
                 i++;
                 }

         }
        
        return res;
    }
}