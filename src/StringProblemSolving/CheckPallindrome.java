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
public class CheckPallindrome {
    
    public static boolean isPallindrome(String str){
        
        int left = 0, right = str.length()-1;
        
        while(left < right){
            char l = str.charAt(left), r = str.charAt(right);
            
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            
            else if(Character.toLowerCase(l) != Character.toLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        String str = "radar";
        
        if(isPallindrome(str)){
            System.out.println("The string : " + str + " is pallindrome!");
        }
        else{
            System.out.println("The string : " + str + " is not pallindrome!");
        }
    }
}
