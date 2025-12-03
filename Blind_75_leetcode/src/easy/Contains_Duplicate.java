/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author D E L L
 * Bài yêu cầu tìm phần tử trùng lặp trong mảng, nếu có trả về true, nếu không trả về false
 * 
 */
public class Contains_Duplicate {
    
    /**Ý tưởng tôi muốn sử dụng map để lọc các phần tử trùng lặp
     *Nếu có phần tử trùng lặp thì size của map sẽ nhỏ hơn size của mảng ban đầu 
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        if(map.size()!=nums.length){
            return true;
        }
        return false;
    }
}
