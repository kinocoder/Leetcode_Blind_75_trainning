/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 */
public class Max_Consecutive_Ones_III {

    public int longestOnes(int[] nums, int k) {
        int numberOfFlip = 0;
        int left = 0;
        int right = 0;
        int sizeOfLongestSubArray = 0;
        while (right < nums.length) {
            if (nums[right] != 0 || numberOfFlip < k) {
                if (nums[right] == 0) {
                    numberOfFlip++;
                }
                if ((right - left + 1) > sizeOfLongestSubArray) {
                    sizeOfLongestSubArray = (right - left + 1);
                }
                right++;
            } else {
                if (nums[left] == 0) {
                    numberOfFlip--;
                }
                left++;
            }

        }
        return sizeOfLongestSubArray;
    }
}
