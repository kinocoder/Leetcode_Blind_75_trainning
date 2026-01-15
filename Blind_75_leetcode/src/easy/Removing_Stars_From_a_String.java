/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;
import java.util.Stack;

/**
 *
 * @author D E L L
 */
public class Removing_Stars_From_a_String {
     public String removeStars(String s) {
       StringBuilder sb = new StringBuilder();
         for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i) == '*'){
                 sb.deleteCharAt(sb.length()-1);
             }else{
                 sb.append(s.charAt(i));
             }
         }
         return sb.toString();
    }
}
