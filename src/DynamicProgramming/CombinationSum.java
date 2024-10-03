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
public class CombinationSum {
    
    public static void findCombinations(int ind, int arr[], int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, arr, target, ans,ds);
    }
    
    public static List<List<Integer>> combinationsSum(int arr[], int target){
        List<List<Integer>> ans = new ArrayList<>();
        
        findCombinations(0, arr, target, ans, new ArrayList<>());
        return ans;
    }
    
    public static void main(String args[]){
        int arr[] = {2,3,6,7};
        int target = 7;
        
        List<List<Integer>> list = combinationsSum(arr,target);
        
        System.out.println("Combinations are: ");
        
        for(int i = 0; i < list.size(); i++ ){
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
        
}
    
    
    
    
    
    

        
    
