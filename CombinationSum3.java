import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        helper(ans, 1, n, k, subAns);
        return ans;
    }

    public static void helper(List<List<Integer>> ans, int start, int n, int k, List<Integer> subAns) {
        if (subAns.size() == k && n == 0) {
            List<Integer> li = new ArrayList<>(subAns);
            ans.add(li);
            return;
        }

        for (int i = start; i <= 9; i++) {
            subAns.add(i);
            helper(ans, i + 1, n - i, k, subAns);
            subAns.remove(subAns.size() - 1);
        }
    }
}
