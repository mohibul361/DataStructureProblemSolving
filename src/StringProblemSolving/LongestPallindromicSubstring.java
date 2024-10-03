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
public class LongestPallindromicSubstring {
    
    public static boolean isPallindrome(String str){
        int left = 0, right = str.length()-1;
        
        while(left < right){
            int l = str.charAt(left), r = str.charAt(right);
            
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
    
    public static String longestPallindromicSubstringNaive(String str){
        int n = str.length();
        
        String longestPallindromicSubstring = "";
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                String subString = str.substring(i, j+1);
                
                if(isPallindrome(subString) && subString.length() > longestPallindromicSubstring.length()){
                    longestPallindromicSubstring = subString;
                }
            }
        }
        
        return longestPallindromicSubstring;
    }
    
    public static void main(String args[]){
        String str = "findnitianhere";
        
        System.out.println(longestPallindromicSubstringNaive(str));
    }
    
    
}

//https://www.javatpoint.com/longest-palindrome-substring
