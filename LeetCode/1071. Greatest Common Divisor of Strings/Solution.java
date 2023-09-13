import java.util.List;
import java.util.Set;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String prefix="",s="",t="";
        char p=str1.charAt(0);
          prefix+=p;
        int i=0,j=0;
          
            while( i<str1.length()&&(str1.charAt(i))!=p){
                prefix+=str1.charAt(i);
                i++;
            }
            while(ans.length()<str1.length()){
                 s+=prefix;
            }
            j=0;
            while(ans.length()<str2.length()){
                t+=prefix;
           }
          if(s.equals(str1)&&t.equals(str2)){
            return prefix;
          }
          

       
        return "";
    }
}