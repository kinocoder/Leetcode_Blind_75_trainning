/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author D E L L
 */
public class Determine_if_Two_Strings_Are_Close {

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Map<Character, Integer> set1 = new HashMap<>();
        Map<Character, Integer> set2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            set1.put(word1.charAt(i), set1.getOrDefault(word1.charAt(i), 0) + 1);
            set2.put(word2.charAt(i), set2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        List<Integer> f1 = new ArrayList<>(set1.values());
        List<Integer> f2 = new ArrayList<>(set2.values());

        Collections.sort(f1);
        Collections.sort(f2);

        if (set1.keySet().equals(set2.keySet()) && f1.equals(f2)) {
            return true;
        }
        return false;
    }
}
