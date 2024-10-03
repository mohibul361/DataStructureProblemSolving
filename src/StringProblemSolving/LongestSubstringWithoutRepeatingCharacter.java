/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblemSolving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class LongestSubstringWithoutRepeatingCharacter {
    
    public static String longestNonRepeatingIs(String str){
        
        if(str.length() == 0){
            return null;
        }
        
        int maxans = Integer.MIN_VALUE, l = 0, start = 0;
        
        Set<Character> set = new HashSet<>();
        
        for(int r = 0; r<str.length(); r++){
            if(set.contains(str.charAt(r))){
                while(l < r && set.contains(str.charAt(r))){
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            
            set.add(str.charAt(r));
            
            maxans = Math.max(maxans, r-l+1);
        }
        return str.substring(start, start+maxans);
    }
    
    public static void main(String args[]){
        
        String str = "takeuforward";
        System.out.println(longestNonRepeatingIs(str));
        System.out.println(longestNonRepeatingIs(str).length());
    }
}
