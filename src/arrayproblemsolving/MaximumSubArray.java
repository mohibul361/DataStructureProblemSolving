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
public class MaximumSubArray {
    
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            
            for(int j = i+1; j < arr.length; j++){
                currSum+=arr[j];
                
                max = Math.max(currSum, max);
            }
        }
        System.out.println("max = " + max);
    }
}
