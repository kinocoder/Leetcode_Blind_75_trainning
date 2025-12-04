/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L Đề bài yêu cầu cho một mảng nums Tính ra mảng result với từng
 * phần tử là tích các số trừ vị trí index hiện tải của mảng ban đầu vd
 * nums[1,2,3,4] result[24,12,8,6] 24 = 2*3*4(ngoại trừ 1) có 3 trường hợp có
 * thể xảy ra: 1- mảng không chứa phần tử 0 2- mảng chứa 1 phần tử 0 3- mảng
 * chứa 2 số 0 trở lên
 */
public class Product_of_Array_Except_Self {

    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount += 1;
            }
        }
        if (zeroCount == 1) {
            int productResult = 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    productResult *= nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    result[i] = productResult;
                } else {
                    result[i] = 0;
                }
            }
        } else if (zeroCount == 0) {
            int productResult = 1;
            for (int i = 0; i < nums.length; i++) {
                productResult *= nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                result[i] = productResult / nums[i];
            }
        } else {
            return result;
        }
        return result;
    }
}
