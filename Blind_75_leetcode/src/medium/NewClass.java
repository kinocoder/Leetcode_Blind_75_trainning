/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author D E L L
 */
public class NewClass {
    public int equalPairs(int[][] grid) {
         Map<String, Integer> map = new HashMap();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb.append(grid[i][j]).append(".");
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }
        for (int j = 0; j < grid.length; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < grid.length; i++) {
                sb.append(grid[i][j]).append(".");
            }
            count += map.getOrDefault(sb.toString(), 0);
        }

        return count;
    }
}
