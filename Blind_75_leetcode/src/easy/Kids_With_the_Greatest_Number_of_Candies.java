/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author D E L L
 */
public class Kids_With_the_Greatest_Number_of_Candies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> resultList = new ArrayList<>();//List kết quả
        int maxCandiesInArray = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (maxCandiesInArray < candies[i]) {
                maxCandiesInArray = candies[i]; // tìm bé có số kẹo lớn nhất có trong mảng
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maxCandiesInArray) { // so sánh( số kẹo của mình + với số kẹo của bé ý) với bé có số kẹo lớn nhất trong mảng
                resultList.add(Boolean.TRUE); // nếu lớn hơn trả về true
            }else{
                resultList.add(Boolean.FALSE);// nếu số kẹo bé hơn trả về false
            }
        }
        return resultList;//trả ra mảng kết quả
    }
}
