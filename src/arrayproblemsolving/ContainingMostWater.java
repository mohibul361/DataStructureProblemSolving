/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblemsolving;

/**
 *
 * @author user
 */
public class ContainingMostWater {
    
    public static int containingMostWater(int arr[]){
        int area = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                int water = (j-i) * Math.min(arr[i], arr[j]);
                
                area = Math.max(area, water);
            }
        }
        return area;
    }
    
    public static void main(String args[]){
        int arr[] = {1,4,2,3};
        
        System.out.println(containingMostWater(arr));
    }  
}
