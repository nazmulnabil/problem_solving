import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Solution {

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

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        findSubSets(list,new ArrayList<Integer>(), nums, 0,nums.length);
        Set<List<Integer>> set = new HashSet<>(list);
        List<List<Integer>> res = new ArrayList<>(set);

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {0};
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsetsWithDup(nums);

        // Print the subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
