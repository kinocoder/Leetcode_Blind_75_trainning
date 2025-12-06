/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 * Yêu cầu đề bài:
 * Tìm mảng con có giá trị lớn nhất
 * Ý tưởng:
 * Duyệt qua mảng con, so sánh giá trị của các mảng con nếu mảng con có giá trị lớn hơn, thay thế giá trị max
 */
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int currentSumArray = nums[0];
        int maxArray = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            currentSumArray = Math.max(nums[i], currentSumArray + nums[i]);
            maxArray = Math.max(maxArray,currentSumArray);
        }
        return maxArray;
    }
}
