/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Find_Pivot_Index {

    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            sumRight += nums[j];
        }
        while (i < nums.length-1) {
            if(sumLeft == sumRight){
                return i;
            }
            sumLeft = sumLeft+nums[i];
            sumRight = sumRight - nums[++i];
        }
        return -1;
    }
}
