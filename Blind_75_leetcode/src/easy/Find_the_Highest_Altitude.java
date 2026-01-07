/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Find_the_Highest_Altitude {
     public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int presentAltitude = 0;
         for (int i = 0; i < gain.length; i++) {
             presentAltitude += gain[i];
             if(highestAltitude < presentAltitude) highestAltitude = presentAltitude;
         }
         return  highestAltitude;
    }
}
