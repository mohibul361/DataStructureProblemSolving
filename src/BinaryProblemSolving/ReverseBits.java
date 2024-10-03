/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryProblemSolving;

/**
 *
 * @author user
 */
public class ReverseBits {
    
    public static void main(String args[]){
        int n = 2;
        int result = 0;
        
        System.out.println("The binary which will be convert: " + Integer.toBinaryString(n));
        
        for(int i = 0; i < 4; i++){
            result = (result<<1) | n & 1;
            
            n>>=1;
        }
        
        System.out.println("The revese binary is: " + Integer.toBinaryString(result));
    }
    
}
