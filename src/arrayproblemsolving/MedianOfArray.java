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
public class MedianOfArray {
    public static void main(String args[]){
        int arr[] ={1,2,3,4};
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        
        if(n % 2 == 0){
            
            double median = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
            System.out.println("The middle element is: " + median);
        }
        else{
            double median = arr[n/2];
            System.out.println("median : " + median);
        }
    }
}
