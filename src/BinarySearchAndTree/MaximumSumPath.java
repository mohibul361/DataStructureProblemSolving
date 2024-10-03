/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchAndTree;

/**
 *
 * @author user
 */
public class MaximumSumPath {
    
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int findMaxPathSum(Node root, int maxi[]){
        if(root == null){
            return 0;
        }
        
        int leftPathSum = Math.max(0, findMaxPathSum(root.left, maxi));
        int rightPathSum = Math.max(0, findMaxPathSum(root.right, maxi));
        
        maxi[0] = Math.max(maxi[0], leftPathSum+rightPathSum+root.data);
        
        return Math.max(leftPathSum, rightPathSum) + root.data;
    }
    
    public static int maxPathSum(Node root){
        int maxi[] = {Integer.MIN_VALUE};
        
        findMaxPathSum(root, maxi);
        
        return maxi[0];
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        
        int maxPathSum = maxPathSum(root);
        
        System.out.println("maxPathSum : " + maxPathSum);
    }
}
