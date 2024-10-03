/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblemSolving;

/**
 *
 * @author user
 */
public class ReverseString {
    public static void main(String args[]){
        String str = "Fahim Islam";
        
        String reverse = "";
        
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
            
        }
        System.out.println("reverse String is:  " + reverse);
    }
}
