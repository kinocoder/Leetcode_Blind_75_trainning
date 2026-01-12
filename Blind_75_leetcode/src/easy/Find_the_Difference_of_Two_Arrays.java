/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author D E L L
 */
public class Find_the_Difference_of_Two_Arrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> listNum1 = new ArrayList<>();
        List<Integer> listNum2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }
        
        for (int i : set1) {
            if(!set2.contains(i)) listNum1.add(i);
        }
        for (int i : set2) {
            if(!set1.contains(i)) listNum2.add(i);
        }

       
        return Arrays.asList(listNum1,listNum2);
    }
}
