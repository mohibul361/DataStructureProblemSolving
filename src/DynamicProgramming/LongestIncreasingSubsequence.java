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
public class LongestIncreasingSubsequence {
    
    public static int getAns(int arr[], int n, int ind, int prevInd, int dp[][]){
        if(ind == n){
            return 0;
        }
        
        if(dp[ind][prevInd+1] != -1){
            return dp[ind][prevInd+1];
        }
        
        int notTaken = 0 + getAns(arr,n,ind+1, ind, dp);
        int taken = 0;
        if(prevInd == -1 || arr[ind]> arr[prevInd]){
            taken = 1 + getAns(arr, n, ind+1, ind, dp);
        }
        
        return dp[ind][prevInd+1] = Math.max(taken, notTaken);
    }
    
    public static int longestIncresingSubsequence(int arr[],int n){
        int dp[][] = new int[n][n+1];
        
        for(int rows[]: dp){
            Arrays.fill(rows, -1);
        }
        return getAns(arr, n, 0, -1, dp);
    }
    
    public static void main(String args[]){
        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = arr.length;
        
        System.out.println("The longest increasing subsequence is: " + longestIncresingSubsequence(arr,n));
    }
}
