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
public class ProductOfArrayExceptSelf {
    
    public static void productExceptSelf(int arr[], int n){
        
        if(n == 1){
            System.out.println(0);
            return;
        }
        
        int left[] = new int[n];
        int right[] = new int[n];
        int product[] = new int[n];
        
        left[0] = 1;
        right[n-1] = 1;
        
        for(int i = 1; i <n; i++){
            left[i] = arr[i-1] * left[i -1];
        }
        
        for(int i = n-2; i >=0; i--){
            right[i] = arr[i+1] * right[i+1];
        }
        
        for(int i = 0; i < n; i++){
            product[i] = left[i] * right[i];
        }
        
        for(int i = 0; i < n; i++){
            arr[i] = product[i];
        }
        
        for(int i = 0; i <n; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    
    public static void main(String args[]){
        int arr[] ={10,3,5,6,2};
        int n = arr.length;
        
        System.out.println("Product of array Except self: " );
        
        productExceptSelf(arr,n);
    }
}
