/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblemSolving;

/**
 *
 * @author user
 */
public class PallindromicSubstring {
    
    public static int pallindromicSubstring(String str){
        int n = str.length();
        boolean dp[][] = new boolean[n][n];
        int count = 0;
        
        for(int g = 0; g < n; g++){
            for(int i = 0, j = g; j < n; j++){
                if(g == 0){
                    dp[i][j] = true;
                }
                else if(g == 1){
                    dp[i][j] = (str.charAt(i) == str.charAt(j));
                }
                else{
                    if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                        dp[i][j] = true;
                    }
                }
                
                if(dp[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    
    public static void main(String args[]){
        String str = "aaa";
        
        System.out.println(pallindromicSubstring(str));
    }
}
