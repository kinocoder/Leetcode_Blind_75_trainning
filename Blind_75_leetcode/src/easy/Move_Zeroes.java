/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
      int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[index++] = nums[i];//lọc ra các số khác không mà vẫn giữ nguyên thứ tự
            }
        }
        while(index<nums.length){
            nums[index++] = 0;// fill 0 cho các số còn lại
        }
    }
}
