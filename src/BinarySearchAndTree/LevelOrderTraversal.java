/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchAndTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class LevelOrderTraversal {
    
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
    
    public static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        
        Queue<Node> q = new LinkedList();
        
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node newNode = q.remove();
            
            if(newNode == null){
                System.out.println();
                
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(newNode.data + " ");
                
                if(newNode.left != null){
                    q.add(newNode.left);
                }
                if(newNode.right != null){
                    q.add(newNode.right);
                }
            }
        }
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        
        levelOrderTraversal(root);
    }
}
