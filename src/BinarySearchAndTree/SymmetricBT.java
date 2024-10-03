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
public class SymmetricBT {
    
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
    
    private static boolean isSymmetricUtil(Node root1, Node root2){
        if(root1 == null || root2 == null){
            return true;
        }
        
        return ((root1.data == root2.data) 
                && isSymmetricUtil(root1.left, root2.right)
                && isSymmetricUtil(root1.right, root2.left));
    }
    
    public static boolean isSymmetric(Node root){
        if(root == null){
            return true;
        }
        
        return isSymmetricUtil(root.left, root.right);
    }
    
    public static void printBT(Node root){
        if(root == null){
            return;
        }
        
        printBT(root.left);
        System.out.print(root.data + " ");
        printBT(root.right);
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        
        System.out.println("The binary tree is: ");
        
        printBT(root);
        
        System.out.println();
        
        if(isSymmetric(root)){
            System.out.println("The tree is symmetric!");
        }
        else{
            System.out.println("The tree is not symmetric!");
        }
    }
}
