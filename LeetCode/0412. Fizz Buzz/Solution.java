import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> resStrings=new ArrayList<>();

        for(int i=1;i<=n;i++){
                 if(i%3==0&&i%5==0)
                   resStrings.add("FizzBuzz");
                  else  if(i%3==0)
                  resStrings.add("Fizz");
                  else  if(i%5==0)
                  resStrings.add("Buzz");
                  else
                   resStrings.add(Integer.toString(i));

        }
        return resStrings;

    }
}