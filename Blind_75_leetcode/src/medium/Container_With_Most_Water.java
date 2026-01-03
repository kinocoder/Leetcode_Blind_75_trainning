/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 */
public class Container_With_Most_Water {

    public int maxArea(int[] height) {
        int leftPoiter = 0;
        int rightPoiter = height.length - 1;
        int ketQua = 0;
        while (leftPoiter < rightPoiter) {
            int dienTich = (rightPoiter - leftPoiter) * (Integer.min(height[leftPoiter], height[rightPoiter]));
            if (dienTich > ketQua) {
                ketQua = dienTich;
            }
            if (height[leftPoiter] > height[rightPoiter]) {
                rightPoiter--;
            } else {
                leftPoiter++;
            }

        }
        return ketQua;
    }
}
