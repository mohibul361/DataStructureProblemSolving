/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblemSolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author user
 */
public class AlienDictionary {
    
    public static List<Integer> topoSort(int K, List<List<Integer>> adj){
        
        int indegree[] = new int[K];
        
        for(int i = 0; i < K; i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < K; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo.add(node);
            
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
            
            
        }
        
        return topo;
        
    }
    
    public static String findOrder(int N, int K, String dic[]){
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < K; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i =0; i < N-1; i++){
            String s1 = dic[i];
            String s2 = dic[i+1];
            
            int len = Math.min(s1.length(), s2.length());
            
            for(int ptr = 0; ptr<len; ptr++){
                if(s1.charAt(ptr)!=s2.charAt(ptr)){
                    adj.get(s1.charAt(ptr)-'a').add(s2.charAt(ptr)-'a');
                    break;
                }
            }
        }
        
        List<Integer> topo = topoSort(K, adj);
        String ans = "";
        for(int it : topo){
            ans = ans + (char)(it + (int) ('a'));
        }
        
        return ans;
    }
    
    public static void main(String args[]){
        String dic[] = {"baa", "abcd", "abca","cab","cad"};
        int N= 5, K= 4;
        
        String ans = findOrder(N, K, dic);
        
        for(int i = 0; i < ans.length(); i++){
            System.out.print(" " + ans.charAt(i));
        }
        
        System.out.println();
    }
}
