/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                boolean leftPosition = (i == 0 || flowerbed[i-1] == 0 );
                boolean rightPosition = (i == (flowerbed.length-1)|| flowerbed[i+1]==0);
                
                if(leftPosition && rightPosition){
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        if(n == 0) return true;
        
        return false;
    }
}
