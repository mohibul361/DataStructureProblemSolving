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
public class LongestCommonSubsequence {
    
    public static int lcs(String str, String str1){
        int n = str.length();
        int m = str1.length();
        
        int curr[] = new int[m+1];
        int prev[] = new int[m+1];
        
        for(int ind1 = 1; ind1 <=n; ind1++){
            for(int ind2 = 1; ind2 <=m; ind2++){
                if(str.charAt(ind1-1) == str1.charAt(ind2-1)){
                    curr[ind2] = 1 + prev[ind2 - 1];
                }
                else{
                    curr[ind2] = Math.max(prev[ind2], curr[ind2-1]);
                }
            }
            prev = (int[]) curr.clone();
        }
        return prev[m];
    }
    
    public static void main(String args[]){
        String str = "acd";
        String str1 = "ced";
        
        System.out.println("The length of longest common subsequence is: " + lcs(str,str1));
    }
        
}
