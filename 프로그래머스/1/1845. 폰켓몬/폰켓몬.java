import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int[] nums) {
        int length = nums.length;
        List<Integer> unique = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!unique.contains(nums[i])) {
                unique.add(nums[i]);
            }
        }

        if (unique.size() < (length / 2)) {
            return unique.size();
        } else return (length / 2);
    }
}