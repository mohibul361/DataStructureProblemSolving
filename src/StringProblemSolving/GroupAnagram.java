/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProblemSolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author user
 */
public class GroupAnagram {
    
    public static void printGroupAnagram(String str[]){
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0; i < str.length; i++){
            String word = str[i];
            
            char[] letters = word.toLowerCase().toCharArray();
            
            Arrays.sort(letters);
            
            String newWord = new String(letters);
            
            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            }
            else{
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
        
        for(String s: map.keySet()){
            List<String> values = map.get(s);
            
            if(values.size() > 1){
                System.out.println(values);
            }
        }
    }
    
    public static void main(String args[]){
        String str[] ={"eat","tea","tan","ate","nat","bat"};
        
        printGroupAnagram(str);
    }
    
}

//https://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together/
