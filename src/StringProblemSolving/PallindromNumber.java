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
public class PallindromNumber {
    
    public static boolean isPallindrome(int n ){
        
        int number = n, reverse = 0, remainder = 0;
        
        while(number > 0){
            remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        
        if(reverse == n){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]){
        int n = 1231;
        
        if(isPallindrome(n)){
            System.out.println("The number " + n + " is pallindrome!");
        }
        else{
            System.out.println("The number " + n + " is not pallindrome!");
        }
    }
}
