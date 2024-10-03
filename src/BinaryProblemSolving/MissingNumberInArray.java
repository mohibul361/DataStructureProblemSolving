/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryProblemSolving;

/**
 *
 * @author user
 */
public class MissingNumberInArray {
    
    public static void main(String args[]){
        int arr[] = {1,3,2,4,6};
        
        int n = arr.length+1;
        
        int sum = (n * (n+1)) / 2;
        int currSum = 0;
        
        for(int i =0; i <arr.length; i++){
            currSum+=arr[i];
        }
        
        int missingNumber = sum - currSum;
        
        System.out.println("missingNumber = " + missingNumber);
    }
}
