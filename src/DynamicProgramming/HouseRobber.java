/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class HouseRobber {
    
    public static long solve(List<Integer> list){
        int n = list.size();
        
        long prev = list.get(0);
        long prev1 = 0;
        
        for(int i = 0; i < list.size(); i++){
            long pick = list.get(i);
            
            if(i > 1){
                pick+=prev1;
            }
            
            long nonPick = 0 + prev;
            
            long curr = Math.max(pick, nonPick);
            
            prev1 = prev;
            prev = curr;
        }
        
        return prev;
    }
    
    public static long robStreet(List<Integer> list, int n){
        List<Integer> listOne = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();
        
        for(int i = 0; i < list.size(); i++){
            if(i != 0){
                listOne.add(list.get(i));
            }
            if(i != n-1){
                listTwo.add(list.get(i));
            }
        }
        long ansOne = solve(listOne);
        long ansTwo = solve(listTwo);
        
        return Math.max(ansOne, ansTwo);
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(6);
        
        int n = list.size();
        System.out.println(robStreet(list,n));
    }
} 

