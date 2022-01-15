import java.util.*;

class Solution {
    int i;
    int b;
    LinkedList<Integer> li = new LinkedList<>();
    LinkedList<Integer> li2 = new LinkedList<>();

    void TwoSum(int[] nums, int target) {
        for (i = 0; i < nums.length; i++) {
            for (b = i + 1; b < nums.length; b++) {
                if (nums[i] + nums[b] == target) {
                    li.push(i);
                    li.push(b);
                }
            }
        }
        System.out.println(li);
    }

    public static void main(String[] args) {
        Solution result = new Solution();
        int[] x = { 2, 7, 11, 15 };
        int y = 9;
        result.TwoSum(x, y);
    }
}