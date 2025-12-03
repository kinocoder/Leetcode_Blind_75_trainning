/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author D E L L Bài yêu cầu tìm phần tử trùng lặp trong mảng, nếu có trả về
 * true, nếu không trả về false
 *
 */
public class Contains_Duplicate {

    /**
     * Ý tưởng tôi muốn sử dụng Hashset để lọc các phần tử trùng lặp Nếu có phần
     * tử trùng lặp thì size của map sẽ nhỏ hơn size của mảng ban đầu
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
