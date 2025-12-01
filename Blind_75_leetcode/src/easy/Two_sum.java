/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author D E L L
 */
public class Two_sum {

    /**
     * @param args the command line arguments
     */
    public int[] twoSum(int[] num , int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i =0;i<num.length;i++){
           int diff = target - num[i];//diff là phần từ cỏn thiếu để tổng 2 số đạt target
           if(map.containsKey(diff)){
               return new int[]{map.get(diff),i};
           }
           map.put(num[i], i);
       }
       return null;
    }
    
}
