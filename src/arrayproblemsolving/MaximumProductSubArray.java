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
public class MaximumProductSubArray {
    
    public static void main(String args[]){
        int arr[] = {15,2,-3,0,-11,-4,-5};
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            int currProduct = arr[i];
            
            for(int j = i+1; j < arr.length; j++){
                currProduct *= arr[j];
                
                max = Math.max(currProduct, max);
            }
        }
        System.out.println("max = " + max);
    }
}
