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
public class CheckBinarySearchTree {
    
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
    
    public static boolean checkBST(Node root, int min, int max){
        if(root == null){
            return true;
        }
        
        if(root.data <= min || root.data >= max){
            return false;
        }
        
        return (checkBST(root.left, min, root.data)
                && checkBST(root.right, root.data, max));
    }
    
    public static boolean isBST(Node root){
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        if(checkBST(root, min, max)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String args[]){
        Node root = new Node(7);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.left = new Node(9);
        root.right.right = new Node(15);
        
        if(isBST(root)){
            System.out.println("The tree is Binary search tree!");
        }
        else{
            System.out.println("The tree is not binary search tree. It is binary tree!");
        }
    }
}
