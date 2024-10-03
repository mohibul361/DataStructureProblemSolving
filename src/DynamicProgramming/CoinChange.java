/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class CoinChange {
    
    public static long waysToMakeCoinChange(int arr[], int n, int T){
        long prev[] = new long[T+1];
        
        for(int i = 0; i <=T; i++){
            if(i % arr[0] == 0){
                prev[i] = 1;
            }
        }
        
        for(int ind = 1; ind<n; ind++){
            long curr[] = new long[T+1];
            
            for(int target = 0; target<=T; target++){
                long notTaken = prev[target];
                
                long taken = 0;
                
                if(arr[ind] <= target){
                    taken = curr[target - arr[ind]];
                }
                
                curr[target] = taken + notTaken;
            }
            prev = curr;
        }
        return prev[T];
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3};
        int n = arr.length;
        int target = 4;
        
        System.out.println("Number of ways of count: = " + waysToMakeCoinChange(arr,n,target));
    }
    
    
		
}
