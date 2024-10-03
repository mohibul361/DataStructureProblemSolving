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
public class NumberOf1Bits {
    
    public static void main(String args[]){
        int n = 3;
        int count = 0;
        
        while(n != 0){
            count += n & 1;
            n = n>>>1;
        }
        
        System.out.println("Number of 1 bit: " + count);
    }
    
}
