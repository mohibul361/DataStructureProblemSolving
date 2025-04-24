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
public class ClimbingStairs {
    
    public static void main(String args[]){
        int n = 3;
        
        int prev2 = 1;
        int prev1 = 1;
        
        for(int i =2; i <=n; i++){
            int current = prev2+prev1;
            
            prev2 = prev1;
            prev1 = current;
        }
        
        System.out.println("Number of ways to climbing stairs: " +prev);
    }
    
}
