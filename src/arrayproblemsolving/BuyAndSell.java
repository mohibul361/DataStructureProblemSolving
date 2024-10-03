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
public class BuyAndSell {
    
    public static void main(String args[]){
        
        int arr[] = {7,1,5,3,6,4};
        
        int min = arr[0];
        
        int maxProfit = Integer.MIN_VALUE;
        
        for(int i = 1; i < arr.length; i++){
            int currProfit = arr[i] - min;
            maxProfit = Math.max(currProfit, maxProfit);
            min = Math.min(arr[i], min);
        }
        
        System.out.println("maxProfit : " + maxProfit);
    }
}
