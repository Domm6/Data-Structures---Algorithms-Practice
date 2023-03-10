import java.util.HashMap;
import java.util.Map;

public class SingleNumberV2 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int current = hm.get(nums[i]);
                hm.replace(nums[i], current + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
