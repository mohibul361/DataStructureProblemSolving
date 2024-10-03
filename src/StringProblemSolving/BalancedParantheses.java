/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblemSolving;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 *
 * @author user
 */
public class BalancedParantheses {
    
    public static boolean isValidParantheses(String str){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);
            
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }
            
            if(stack.isEmpty()){
                return false;
            }
            
            char ch;
            
            switch(x){
                case ')':
                    ch = stack.pop();
                    if(ch == '{' || ch == '['){
                        return false;
                    }
                    break;
                
                case '}':
                    ch = stack.pop();
                    if(ch == '(' || ch == '['){
                        return false;
                    }
                    break;
                
                case ']':
                    ch = stack.pop();
                    if(ch == '(' || ch == '{'){
                        return false;
                    }
                    break;
            }
                  
        }
        return (stack.isEmpty());
    }
      
    public static void main(String args[]){
        String str = "{}[])";
        
        if(isValidParantheses(str)){
            System.out.println("Valid!");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
