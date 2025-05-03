/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class HouseRobber {
    
   public static int houseRobbed(int arr[]){
        int n = arr.length;
        if(n==0){
            return 0;
        }
        if(n == 1){
            return arr[0];
        }
        
        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
        }
        
        return dp[n-1];
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        
        System.out.println(houseRobbed(arr));
    }
} 

