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
    
    public static int coinChange(int coins[], int amount){
        int dp[] = new int[amount+1];
        Arrays.fill(dp, amount+1);
        
        dp[0] = 0;
        
        for(int i = 1; i <= amount; i++){
            for(int coin: coins){
                if(i-coin >= 0){
                    dp[i] = Math.min(dp[i], dp[i-coin] +1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
    
    public static void main(String[] args) {
        int coin[] = {1,2, 5};
        int amount = 11;
        
        System.out.println(coinChange(coin, amount));
    }
    
    
		
}
