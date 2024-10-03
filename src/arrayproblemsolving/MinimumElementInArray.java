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
public class MinimumElementInArray {
    
    public static void main(String args[]){
        int arr[] = {4,6,1};
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        System.out.println("min : " + min);
    }
}
