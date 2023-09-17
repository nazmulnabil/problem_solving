class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i))){
                str+= s.charAt(i);
            }
        }
           
        str.toLowerCase();
        char[] chArr=str.toCharArray() ;
        int left=0,right=chArr.length-1;

        while(left<right){
            if(chArr[left]==chArr[right]){
                left++;
                right--;
            }
            else
              return false;
        }

        
        return true;
    }
}