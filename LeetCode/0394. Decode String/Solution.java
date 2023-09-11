import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack =  new Stack<>();
        Stack<String> stringStack =  new Stack<>();
        int count= 0;
        String res="";
              
            for(char c : s.toCharArray()){  
                if(Character.isDigit(c))
                        count=count*10 + (c-'0');

                else if(c=='['){
                  countStack.push(count);
                  stringStack.push(res);
                  count=0;
                  res="";
                }
                else if(c==']'){
                       StringBuilder temp=new StringBuilder(stringStack.pop());
                       count=countStack.pop();
                       for(int i=0;i<count;i++){
                        temp.append(res);
                       }
                       res=temp.toString();
                       count=0;
                     }
                else{
                  res+=c;
                }
              }
           return res;     
         }
      }  