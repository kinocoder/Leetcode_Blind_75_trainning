/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 */
public class LeetCode1493 {

    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        boolean isDeleted = false;
        int longestSubArray = 0;
        while (right < nums.length ) {
            if (nums[right] != 0 || !isDeleted) {
                if (nums[right] == 0) {
                    isDeleted = true;
                }
                right++;
            } else {
                if (nums[left] == 0) {
                    isDeleted = false;
                }
                left++;
            }
            if (longestSubArray < (right - left)) {
                longestSubArray = (right - left);
            }
        }

        return longestSubArray-1;
    }
}
