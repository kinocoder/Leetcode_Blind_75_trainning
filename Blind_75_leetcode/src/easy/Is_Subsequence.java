/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easy;

/**
 *
 * @author D E L L
 */
public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        int bienDemCuaChuoiS = 0;
        int bienDemCuaChuoiT = 0;
        while(bienDemCuaChuoiS<s.length() && bienDemCuaChuoiT<t.length()){
            if(t.charAt(bienDemCuaChuoiT) == s.charAt(bienDemCuaChuoiS)){
                bienDemCuaChuoiS++;
                bienDemCuaChuoiT++;
            }else{
                bienDemCuaChuoiT++;
            }
        }
       return bienDemCuaChuoiS == s.length();
    }
}
