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
public class MaximumDepthOfBinaryTree {
    
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
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);
        
        int depthOfTree = height(root);
        
        System.out.println("Depth/height of binary tree: " + depthOfTree);
    }
}
