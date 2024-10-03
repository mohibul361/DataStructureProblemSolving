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
public class SecondLargestElement {
    public static void main(String args[]){
        int arr[] = {2,4,3};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int num: arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }
        System.out.println("secondLargest = " + secondLargest);
        
       
    }
}
