package hot;

import java.util.HashMap;
import java.util.Map;

public class E1 {
    public int[] twoSum2(int[] nums, int target) {
//        //双指针法
//        //指针i遍历nums数组，指针j指向i的后一位
//        //从j到nums.length - 1 来找到 target - nums[i] 数字
//        int res[] = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if(nums[j] == target - nums[i]){
//                    res[0] = i;
//                    res[1] = j;
//                    return res;
//                }
//            }
//        }
//        return res;
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
        }
        return res;
    }

}
