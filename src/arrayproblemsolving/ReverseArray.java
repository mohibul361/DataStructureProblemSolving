/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblemsolving;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class ReverseArray {
    
    public static void main(String args[]){
        
        int arr[] = {12,23,12,25,14,12,1};
        
        System.out.println("Initial array is: ");
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
        System.out.println("Reverse array is: ");
        
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+ " ");
        }
        
    }
}