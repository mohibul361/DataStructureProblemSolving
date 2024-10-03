/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblemsolving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class ThreeSum {
    
    public static boolean findTriplet(int arr[], int sum){
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length-1; i++){
            int currSum = sum - arr[i];
            
            for(int j = i+1; j < arr.length; j++){
                
                set.add(arr[j]);
                
                int requiredSum = currSum - arr[j];
                
                if(set.contains(requiredSum)){
                    System.out.println("Triplet is: " + arr[i]+ " + " + arr[j] + " + " + requiredSum + " = " +sum);
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int arr[] = {41,25,36,23,12};
        int sum = 63;
        
        if(!findTriplet(arr, sum)){
            System.out.println("The triplet is not found!");
        }
    }
}
