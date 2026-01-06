/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Maximum_Average_Subarray_I {

    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k + i - 1;
        double result = 0;
        double sum = 0;
        for (int l = i; l <= j; l++) {
            sum += nums[l];
        }
        result = sum;
        while (j < nums.length - 1) {
            sum = sum - nums[i++] + nums[++j];
            if (sum > result) {
                result = sum;
            }

        }
        return result / k;
    }
}
