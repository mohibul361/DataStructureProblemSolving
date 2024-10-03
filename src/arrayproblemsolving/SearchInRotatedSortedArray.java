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
public class SearchInRotatedSortedArray {
    
    public static void main(String args[]){
        int arr[] = {6,7,1,2,3,4,5};
        
        
        int left = 0;
        int right = arr.length-1;
        int target = 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == target){
                System.out.println("Element: " + target+ "found at index: " + mid);
                break;
            }
            
            if(arr[left]<= arr[mid]){
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        
  
        
        
    }
}
