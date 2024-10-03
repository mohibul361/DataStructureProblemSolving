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
public class IdenticalOfBothBinaryTree {
    
    public static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
        }
    }
    
    public static boolean isIdentical(Node root1, Node root2){
        //if both the tree are null then trees are identical
        
        if(root1 == null && root2 == null){
            return true;
        }
        
        //if one of the tree is null then it will not identical
        if(root1 == null || root2 == null){
            return false;
        }
        
        //if the nodes has chi8ld it can be identical
        return ((root1.data == root2.data) 
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right));
    }
    
    public static void main(String args[]){
        // Node1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.right = new Node(4);

        // Node2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.right = new Node(4);
        
        if(isIdentical(root1, root2)){
            System.out.println("The tree  are identical!");
        }
        else{
            System.out.println("The tree  are not identical");
        }
    }
}
