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
public class MaximumSumOfNonAdjacentElement {
    
    public static int solveUtil(int ind, int arr[], int n, int dp[]){
        if(ind < 0){
            return 0;
        }
        
        if(ind == 0){
            return arr[ind];
        }
        
        if(dp[ind] != -1){
            return dp[ind];
        }
        
        int pick = arr[ind] + solveUtil(ind-2, arr, n, dp);
        int nonPick = solveUtil(ind-1, arr, n, dp);
        
        return dp[ind] = Math.max(pick, nonPick);
    }
    
    public static int solve(int arr[], int n){
        int dp[] = new int[n+1];
        
        Arrays.fill(dp, -1);
        
        return solveUtil(n-1, arr, n, dp);
    }
    
    public static void main(String args[]){
        int arr[] = {2, 1, 4, 9};
        int n = arr.length;
        
        int result = solve(arr, n);
        
        System.out.println(result);
    }
    
}
