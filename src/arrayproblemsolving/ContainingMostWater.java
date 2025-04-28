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
        int area = 0;
        int left = 0;
        int right = arr.length-1;
        
        while(left < right){
            int water = Math.min(arr[left], arr[right) * (right - left);
            area = Math.max(area, water);

            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
            
        return area;
    }
    
    public static void main(String args[]){
        int arr[] = {1,4,2,3};
        
        System.out.println(containingMostWater(arr));
    }  
}
