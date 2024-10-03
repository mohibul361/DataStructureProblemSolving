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
public class TwoSumPointer {
    
    public static void main(String args[]){
        int arr[] = {2,1,3,4,5,6};
        int target = 9;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right){
            if(arr[left] + arr[right] == target){
                System.out.println("Element found at index : (" + left + "," + right+")");
                break;
            }
            
            if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
