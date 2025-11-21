import java.util.*;

public class Problem1 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0,1);

        int rSum = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++) {
            rSum += nums[i];
            int diff = rSum - k;
            if(hmap.containsKey(diff)) {
                ans += hmap.get(diff);
            }

            hmap.put(rSum, hmap.getOrDefault(rSum, 0) + 1);
        }

        return ans;
    }

    public
}