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
public class CalculateAverageArray {
    public static void main(String args[]){
        int arr[] = {5,2,6,3,4};
        
        int n = arr.length-1;
        
        int sum=0;
        
        for(int num : arr){
            sum = sum + num;
        }
        
        System.out.println("sum : " + sum/n);
    }
}
