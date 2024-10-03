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
public class RotatedSortedArrayMinimum {
    
    public static void main(String args[]){
        int arr[] = {162,177,62,154};
        
        int left = 0;
        int right = arr.length-1;
        
        int min = Integer.MAX_VALUE;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            
            if(arr[left]<= arr[right]){
                min = Math.min(arr[left], min);
                break;
            }
            
            if(arr[left]<= arr[mid]){
                min = Math.min(arr[left], min);
                left = mid+1;
            }
            else{
                min = Math.min(arr[mid], min);
                right = mid - 1;
            }
        }
        
        System.out.println("min = " + min);
    }
}
