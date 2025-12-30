/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 */
public class Increasing_Triplet_Subsequence {

    public boolean increasingTriplet(int[] nums) {
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;
        int thirdNum =Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] <= firstNum) {
                firstNum = nums[i];
                continue;
            } else if (nums[i] <= secondNum) {
                secondNum = nums[i];
            } else {
                return true;
            }

        }
        return false;
    }
}
