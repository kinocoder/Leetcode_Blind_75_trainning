/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

import java.util.Arrays;

/**
 *
 * @author D E L L
 */
public class Max_Number_of_K_Sum_Pairs {

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while (left < right) {
            if (nums[left] + nums[right] < k) {
                left++;
            }else if (nums[left] + nums[right] > k ) {
                right--;
            }else{
                right--;
                left++;
                count++;
            }
        }
        return count;
    }
}
