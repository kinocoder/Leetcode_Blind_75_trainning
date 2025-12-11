/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 * Đề bài yêu cầu tìm tích của mảng con lớn nhất
 * Ý tưởng: Dynamic programming
 * sử dụng 3 biến 
 * mảng lớn nhất
 * mảng nhỏ nhất --> hỗ trợ đảo kết quả khi gặp 2 số âm
 * kết quả
 */
public class Maximum_Product_Subarray {
     public int maxProduct(int[] nums) {
        int maxSub = nums[0];
        int minSub = nums[0];
        int results = nums[0];
        
         for (int i = 1; i < nums.length; i++) {
             int max = Math.max(nums[i],Math.max(maxSub*nums[i],minSub*nums[i]));
             int min = Math.min(nums[i],Math.min(maxSub*nums[i],minSub*nums[i]));
             maxSub =max;
             minSub =min;
             results = Math.max(results,maxSub);
         }
         return results;
    }
}
