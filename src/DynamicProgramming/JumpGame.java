/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author user
 */                                                      
public class JumpGame {
    
    public static boolean canJump(int arr[], int n){
        int maxIndex = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(i > maxIndex){
                return false;
            }
            
            maxIndex = Math.max(maxIndex, i + arr[i]);
        }
        return true;
    }
   
    public static void main(String args[]){
        int arr[] = {4, 3, 7, 1, 2};
        
        int n = arr.length;
        
        boolean result = canJump(arr,n);
        
        if(result){
            System.out.println("Frog can jump to the last index");
        }
        else{
            System.out.println("Frog can not jump to the last index!");
        }
    }
                                                                                                                                                                                                                              
}
