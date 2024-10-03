/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntervalProblemSolving;

/**
 *
 * @author user
 */
public class RepeatingAndMissingNumber {
    
    public static int[] findMissingRepeatingNumber(int arr[]){
        int n = arr.length;
        
        long formaOne = (n * (n + 1))/2;
        long formaTwo = (n * (n + 1) * (2 * n + 1))/ 6;
        
        long s = 0, s2 = 0;
        
        for(int i = 0; i < n; i++){
            s += arr[i];
            s2 += (long) arr[i] * (long) arr[i];
        }
        
        long valOne = s - formaOne;
        long valTwo = s2 - formaTwo;
        
        valTwo = valTwo/valOne;
        
        long x = (valOne + valTwo) / 2;
        long y = x - valOne;
        
        int ans[] = {(int) x, (int) y};
        return ans;
    }
    
    public static void main(String args[]){
        int arr[] = {3,1,2,5,4,6,7,5};
        int ans[] = findMissingRepeatingNumber(arr);
        
        System.out.println("Missing number and repeating number is:  {" + ans[0] + 
                "," + ans[1] + "}");
    }
}
