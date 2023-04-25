package jzoffer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E1 {
    public int findRepeatNumber(int[] nums) {
        //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
        //数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
        //请找出数组中任意一个重复的数字。
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i + 1];
            if(nums[i] == temp){
                return nums[i];
            }
        }
        return 0;
    }
}
