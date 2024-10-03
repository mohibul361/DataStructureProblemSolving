/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListProblemSolving;

import java.util.Stack;

/**
 *
 * @author user
 */
public class ReverseAStack {
    
    static Stack<Character> s = new Stack();
    
    public static void insertAtBottom(char c){
        
        if(s.isEmpty()){
            s.push(c);
        }
        
        else{
            char x = s.peek();
            s.pop();
            insertAtBottom(c);
        
            s.push(x);
        }
    }
    
    public static void reverse(){
        if(s.size() > 0){
            
            char c = s.peek();
            s.pop();
            reverse();
            
            insertAtBottom(c);
        }
    }
    
    public static void main(String args[]){
        
        s.push('c');
        s.push('a');
        s.push('b');
        
        System.out.println(s);
        
        reverse();
        
        System.out.println(s);
    }
}
