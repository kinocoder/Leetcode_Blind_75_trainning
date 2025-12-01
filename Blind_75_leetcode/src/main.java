/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import easy.Two_sum;

/**
 *
 * @author D E L L
 */
public class main {
    public static void main(String[] args) {
        Two_sum ts = new Two_sum();
        
        int[] testlist1 = {1,3,5,7};
        int target = 6;
        int[] results = ts.twoSum(testlist1, target);
        System.out.print("[");
        for (int result : results) {
            System.out.print(result+" ");
        }
        System.out.print("]");
        
    }
}
