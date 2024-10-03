/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproblemsolving;

/**
 *
 * @author user
 */
public class LargestElementInArray {
    
    public static void main(String args[]){
        int arr[] = {5,6,11,4};
        
        int largest = arr[0];
        
        for(int num : arr){
            if(largest < num){
                largest = num;
            }
        }
        
        System.out.println("largest : " + largest);
    }
    
}
