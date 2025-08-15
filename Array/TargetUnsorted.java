package DSA.Array;
//map.getfor() used to get the value from th hashmap

//map.put used to put the value
//map.conatinskey is used to check the value is present in the map or not

import java.util.HashMap;

public class TargetUnsorted {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
