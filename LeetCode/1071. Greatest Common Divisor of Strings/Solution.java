import java.util.List;
import java.util.Set;

class Solution {
    public static int gcdStrings(int num1,int num2){
         while(num2!= 0){
           int temp=num2;
           num2=num1%num2;
           num1=temp;
         }    
          return num1;
    }
    public String gcdOfStrings(String str1, String str2) {
        String prefix="";
        
          if((str1+str2).equals(str2+str1)){
            int gcd=gcdStrings(str1.length(),str2.length());
                 return str1.substring(0, gcd);

          }
        return "";
    }
}