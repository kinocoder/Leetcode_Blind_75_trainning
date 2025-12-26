package easy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author D E L L
 */
public class Reverse_Vowels_of_a_String {

    public static boolean isVowels(char a) {
        return "aeiouAEIOU".indexOf(a) != -1;
    }

    public String reverseVowels(String s) {
        char[] arrayChar = s.toCharArray();
        int left = 0;
        int right = arrayChar.length - 1;
        while (left < right) {
            while(left < right && !isVowels(arrayChar[left])){
                left++;
            }
            
            while(left < right && !isVowels(arrayChar[right])){
                right--;
            }
            
            if(left<right){
                char temp = arrayChar[left];
                arrayChar[left] = arrayChar[right];
                arrayChar[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arrayChar);
    }
}
