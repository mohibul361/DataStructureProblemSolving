/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphProblemSolving;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class NumberOfIsland {
    
    static class Pair{
        int first;
        int second;
        
        public Pair(int f, int s){
            this.first = f;
            this.second = s;
        }
    }
    
    private static void bfs(int row, int col, int vis[][], char grid[][]){
        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();
            
            for(int delrow =-1; delrow <=1; delrow++){
                for(int delcol = -1; delcol<=1; delcol++){
                    int nrow = r + delrow;
                    int ncol = c + delcol;
                    
                    if(nrow >=0 && nrow <n && ncol >= 0 && ncol<m
                    && vis[nrow][ncol] == 0 && grid[nrow][ncol]== '1'){
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow,ncol));
                    }
                    
                }
            }
        }
    }
    
    public static int numIsIsland(char grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int cnt = 0;
        
        for(int row =0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(vis[row][col] == 0 && grid[row][col] == '1'){
                    cnt++;
                    bfs(row,col,vis,grid);
                }
            }
        }
        
        return cnt;
    }
    
    public static void main(String args[]){
        char[][] grid = {
            {'0','1','1','1', '0', '0', '0'},
            {'0', '0', '1', '1', '0', '1', '0'}
        };
        
        System.out.println(numIsIsland(grid));
    }
}

//takeuforward
