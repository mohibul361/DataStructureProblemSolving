/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblemSolving;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class CheckAnagram {
    
    public static boolean isAnagram(String str, String str1){
        int length = str.length();
        int lengthOne = str1.length();
        
        if(length == lengthOne){
            char[] arrOne = str.toLowerCase().toCharArray();
            char[] arrTwo = str1.toLowerCase().toCharArray();
            
            Arrays.sort(arrOne);
            Arrays.sort(arrTwo);
            
            boolean result = Arrays.equals(arrOne, arrTwo);
            
            if(result){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        String str = "Dusty";
        String strOne = "Study";
        
        if(isAnagram(str, strOne)){
            System.out.println("The string  " + str + " and " + strOne + " is anagram!");
        }
        else{
            System.out.println("The string  " + str + " and " + strOne + " is not anagram!"); 
        }
    }
}
