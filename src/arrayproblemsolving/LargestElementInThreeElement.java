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
public class LargestElementInThreeElement {
    
    public static void main(String args[]){
        int arr[] = {5,6,4};
        
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        
        int temp = a > b ? a:b;
        int max = temp > c ? temp : c;
        System.out.println("max = " + max);
        
    }
    
}
