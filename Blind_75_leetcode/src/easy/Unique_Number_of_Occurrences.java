/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author D E L L
 */
public class Unique_Number_of_Occurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
           map.put(i, map.getOrDefault(i, 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (!set.contains(value)) {
                set.add(value);
            } else {
                return false;
            }
        }
        return true;
    }
}
