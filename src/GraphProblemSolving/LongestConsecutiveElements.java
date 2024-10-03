/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblemSolving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class LongestConsecutiveElements {
    
    public static int longestConsecutiveElement(int arr[]){
        int n = arr.length;
        
        if(n==0){
            return 0;
        }
        
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        
        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;
                
                while(set.contains(x+1)){
                    count = count+1;
                    x= x+1;
                }
                
                longest = Math.max(longest, count);
            }
        }
        
        return longest;
    }
    
    
    public static void main(String args[]){
        int arr[] = {100,1,101,2,4,2,3,102};
        
        int ans = longestConsecutiveElement(arr);
        
        System.out.println("Longest Consecutive Element is: " + ans);
    }
}
