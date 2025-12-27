/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 */
public class Reverse_Words_in_a_String {
     public String reverseWords(String s) {
        String[] arrayString = s.trim().split("\\s+"); //xóa từ hai khoảng tráng trở lên
        StringBuilder result = new StringBuilder();
        
        for(int i = arrayString.length -1;i>=0;i--){
            result.append(arrayString[i]);
            if(i>0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
