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
public class ElementIndex {
    public static void main(String args[]){
        int arr[] = {2,1,3};
        
        int number = 3;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == number){
                System.out.println("Index is: " + i);
            }
        }
    }
}
