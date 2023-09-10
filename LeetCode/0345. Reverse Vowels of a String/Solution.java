class Solution {
                  public String reverseVowels(String s) {
                      String revString="";
                        char[] chArr=s.toCharArray();
                          
                        int left=0,right=s.length()-1;
              
                        while(left<right){
                          if((chArr[left]=='a'||chArr[left]=='e'||chArr[left]=='i'||chArr[left]=='o'||chArr[left]=='u'||
                              chArr[left]=='A'||chArr[left]=='E'||chArr[left]=='I'||chArr[left]=='O'||chArr[left]=='U')&&
                          (chArr[right]=='a'||chArr[right]=='e'||chArr[right]=='i'||chArr[right]=='o'||chArr[right]=='u'||
                              chArr[right]=='A'||chArr[right]=='E'||chArr[right]=='I'||chArr[right]=='O'||chArr[right]=='U')){
                                 char temp=chArr[left];
                                 chArr[left] = chArr[right];
                                 chArr[right]= temp;
                                 left++;
                                 right--;
                                }
                                else if((chArr[left]=='a'||chArr[left]=='e'||chArr[left]=='i'||chArr[left]=='o'||chArr[left]=='u'||
                                chArr[left]=='A'||chArr[left]=='E'||chArr[left]=='I'||chArr[left]=='O'||chArr[left]=='U'))
                                   right--;
                                   else
                                     left++;
                            }
                           revString=new String(chArr);
                      
                           return revString;
                  }
              }
           