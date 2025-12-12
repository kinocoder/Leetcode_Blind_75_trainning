/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 * Đề bài yêu cầu tim phần tử nhỏ nhất trong một mảng xoay theo phương pháp với độ phức tạp thời gian là log n
 */
public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums[0];

        if(nums.length == 1) return nums[0]; //trường hợp mảng chỉ có 1 phần tử
        
        while(left <= right){
            if(nums[left] <= nums[right]){
                result = Math.min(result, nums[left]);
            }
            int mid = (left + right)/2;
            
            result = Math.min(result, nums[mid]);
            
            if(nums[left]<= nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return result;
    }
}
