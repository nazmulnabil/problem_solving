import java.util.ArrayList;
import java.util.List;

public class Solution {
  
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        findSubSets(list,new ArrayList<Integer>(), nums, 0,nums.length);
        return list;
    }

    public static void findSubSets(List<List<Integer>> list,List<Integer> ds, int[] nums, int index,int n) {
        if (index == n) {
            list.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        findSubSets(list,ds, nums, index + 1,n);
        ds.remove(ds.size() - 1);
        findSubSets(list,ds, nums, index + 1,n);
        return;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsets(nums);
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
