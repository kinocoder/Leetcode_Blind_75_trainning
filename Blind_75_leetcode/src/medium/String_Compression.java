/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

import java.util.HashMap;

/**
 *
 * @author D E L L
 */
public class String_Compression {

    public int compress(char[] chars) {
        int temp = 0;
        int count = 1;
        char charT = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (charT == chars[i]) {
                count++;
            } else {
                chars[temp++] = charT;

                if (count > 1) {
                    String num = String.valueOf(count);
                    for (char a : num.toCharArray()) {
                        chars[temp++] = a;
                    }
                }
                count = 1;
                charT = chars[i];
            }
        }
        //nhóm cuối do không có điều kiện chốt 
        chars[temp++] = charT;
        if (count > 1) {
            String num = String.valueOf(count);
            for (char a : num.toCharArray()) {
                chars[temp++] = a;
            }
        }
        return temp;
    }
}
