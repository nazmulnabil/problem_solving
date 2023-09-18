import java.util.Map;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        int c=0;
        Set<String> set = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            StringBuilder sBuilder=new StringBuilder();
            String str=emails[i];
            String[] subStrings=str.split("@");

            if(subStrings[0].contains("+")){
                int k=0;
                while(subStrings[0].charAt(k)!='+'){
                    if(subStrings[0].charAt(k)!='.')
                     sBuilder.append(subStrings[0].charAt(k));
                        k++;
                }
            }
            else{
                for(int m=0;m<subStrings[0].length();m++)
                if(subStrings[0].charAt(m)!='.')

                sBuilder.append(subStrings[0].charAt(m));
            }
            sBuilder.append("@");
            sBuilder.append(subStrings[1]);
           set.add(sBuilder.toString());
        }
        return set.size();
    }
}