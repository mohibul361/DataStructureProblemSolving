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
public class RemoveDuplicates {
    public static void main(String args[]){
        int arr[] = {1,1,3,5,5,6};
        
        System.out.println("Initial array is: ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        System.out.println();
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }
        
        int count = 0;
        
        int result[] = new int[set.size()];
        
        for(int res: set){
            result[count++] = res;
        }
        
        System.out.println("After removing duplicates: ");
        
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }
        
        
    } 
}
