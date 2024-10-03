/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixProblemSolved;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class SpiralTraversalMatrix {
    
    public static List<Integer> printSpiral(int matrix[][]){
        List<Integer> ans = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int top = 0, right = n-1, left = 0, bottom = m-1;
        
        while(top <= bottom && left <= right){
            
            //traverse left to right
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            
            //traverse top to bottom
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            
            //traverse right to left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //traverse bottom to top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return ans;
    }
    
    public static void main(String args[]){
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        List<Integer> ans = printSpiral(matrix);
        
        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    
}
