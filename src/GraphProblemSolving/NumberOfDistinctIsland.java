/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblemSolving;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author user
 */
public class NumberOfDistinctIsland {
    
    private static void dfs(int row, int col, int vis[][], int grid[][], ArrayList<String> vec, int row0, int col0){
        
        vis[row][col] = 1;
        
        vec.add(toString(row-row0, col-col0));
        
        int n = grid.length;
        int m = grid[0].length;
        
        int delrow[] = {-1,0,+1,0};
        int delcol[] = {0,-1,0,+1};
        
        for(int i = 0; i < 4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            
            if(nrow >=0 && nrow < n && ncol >=0 && ncol <m
            && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                dfs(nrow,ncol,vis,grid,vec,row0,col0);
            }
        }
        
    }
    
    public static String toString(int r, int c){
        return Integer.toString(c) + " " + Integer.toString(r);
    }
    
    public static int numOfDistinctIsland(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        
        HashSet<ArrayList<String>> set = new HashSet<>();
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(vis[row][col] == 0 && grid[row][col] == 1){
                    ArrayList<String> vec = new ArrayList<>();
                    dfs(row,col,vis,grid,vec,row,col);
                    set.add(vec);
                }
            }
        }
        
        return set.size();
    }
    
    public static void main(String args[]){
        int grid[][] = 
        {
            {1, 1, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1}
        };
        
        int ans = numOfDistinctIsland(grid);
        System.out.println("Number of distinct island is: " + ans);
    }
        
}
