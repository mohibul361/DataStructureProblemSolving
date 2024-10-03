/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblemsolving;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author user
 */
public class ContainsDuplicate {
    
    public static void main(String args[]){
        int arr[] = {5,4,3,1,1,3};
        
        Set<Integer> set = new HashSet<>();
        
        for(Integer s: arr){
            if(set.contains(s)){
                System.out.println("duplicate found!" + s);
                break;
            }
            set.add(s);
        }
        
       
    }
}
