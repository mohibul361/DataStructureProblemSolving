/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryProblemSolving;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class CountingBits {
    
    public static void main(String args[]){
        
        int n = 11;
        
        int result[] = new int[n+1];
        
        for(int i =1; i <=n; i++){
            result[i] = result[i/2] + i % 2;
        }
        
        System.out.println(Arrays.toString(result));
    }
}
