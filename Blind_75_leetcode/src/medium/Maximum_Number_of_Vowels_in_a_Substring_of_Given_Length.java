/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/**
 *
 * @author D E L L
 */
public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {
    
    public boolean isVolwels(char a){
        if(a == 'a'||a == 'i'||a == 'u'||a == 'e'||a == 'o') return true;
        return false;
    }

    public int maxVowels(String s, int k) {
        char[] charArrasys = s.toCharArray();
        int i = 0;
        int j = k+i-1;
        int count = 0;
        for (int l = i; l <= j; l++) {
            if(isVolwels(charArrasys[l])) count++;
        }
        int result = count;
        while(j<charArrasys.length-1){
            if(isVolwels(charArrasys[i++])) count--;
            if(isVolwels(charArrasys[++j])) count++;
            if(count > result) result = count;
        }
        return count;
    }
}
