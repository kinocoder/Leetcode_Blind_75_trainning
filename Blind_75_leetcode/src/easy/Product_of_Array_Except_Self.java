/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L Đề bài yêu cầu cho một mảng nums Tính ra mảng result với từng
 * phần tử là tích các số trừ vị trí index hiện tải của mảng ban đầu vd
 * nums[1,2,3,4] result[24,12,8,6] 24 = 2*3*4(ngoại trừ 1)
 */
public class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int sizeOfNums = nums.length;
        int[] results = new int[sizeOfNums];
        //base 
        results[0] = 1;
        for (int i = 1; i < sizeOfNums; i++) {
            results[i] = results[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int i = sizeOfNums - 1; i >= 0; i--) {
            results[i] *= suffix;
            suffix *= nums[i];
        }

        return results;
    }
}
