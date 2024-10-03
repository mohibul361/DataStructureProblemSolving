/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblemsolving;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class FirstNonRepeatingElement {
    public static void main(String args[]){
        int arr[]  = {5,5,4,4,3,2};
        
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for(int num: arr){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for(int num : arr){
            if(countMap.get(num) == 1){
                System.out.println("The first non repeating element is: " + num);
                break;
            }
            
        }
    }
}
