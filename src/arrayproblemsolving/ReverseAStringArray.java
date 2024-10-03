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
public class ReverseAStringArray {
    public static void main(String args[]){
        String arr[] = {"Fahim", "Abir", "Limon", "Komol"};
        
        for(int i=0; i < arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }
}
