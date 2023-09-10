import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts =  new Stack<>();
        Stack<Character> chars =  new Stack<>();
        int i=0;
        StringBuilder sBuilder=new StringBuilder();
        String res="";

        while(i<s.length()){
              if(Character.isDigit(s.charAt(i)))
              counts.push(s.charAt(i));
              else if(Character.isLetter(s.charAt(i)))
              chars.push(s.charAt(i));
              else if(s.charAt(i)=='[')
              chars.push(s.charAt(i));
               
              else if(s.charAt(i)==']'){
                     while(chars.peek()!='[')
                     {
                        sBuilder.append(chars.pop());
                    }
                     int c= counts.pop();
                     String str=sBuilder.toString();
                     for(int j=0;j<c;j++){
                        res+=str;
                     }
              }

        }
                return res;     
        
    }
}