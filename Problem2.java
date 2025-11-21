import java.util.*;

public class Problem2 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        int rSum = 0;
        int maxLen = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums[i] == 0) {
                rSum -= 1;
            } else {
                rSum += 1;
            }

            if(hmap.containsKey(rSum)) {
                int totalLen = i - hmap.get(rSum);
                maxLen = Math.max(totalLen, maxLen);
            } else {
                hmap.put(rSum, i);
            }
        }

        return maxLen;
    }
}