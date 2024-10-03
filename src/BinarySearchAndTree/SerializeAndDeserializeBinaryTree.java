/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchAndTree;

import java.util.*;

/**
 *
 * @author user
 */

public class SerializeAndDeserializeBinaryTree {
    
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
    
    public static String serialize(Node root){
        if(root == null){
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        Queue<Node> q = new LinkedList();
        q.offer(root);
        
        while(!q.isEmpty()){
            Node currNode = q.poll();
            
            if(currNode == null){
                sb.append("#,");
            }
            else{
                sb.append(currNode.data).append(",");
                
                q.offer(currNode.left);
                q.offer(currNode.right);
            }
        }
        return sb.toString();
    }
    
    public static Node deserialize(String data){
        if(data.isEmpty()){
            return null;
        }
        
        StringBuilder s = new StringBuilder(data);
        int commaIndex = s.indexOf(",");
        String str = s.substring(0, commaIndex);
        s.delete(0, commaIndex+1);
        Node root = new Node(Integer.parseInt(str));
        Queue<Node> q = new LinkedList();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            Node node = q.poll();
            
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex+1);

            if(!str.equals("#")){
                Node leftNode = new Node(Integer.parseInt(str));
                node.left = leftNode;
                q.offer(leftNode);
            }
            
            commaIndex = s.indexOf(",");
            str = s.substring(0, commaIndex);
            s.delete(0, commaIndex+1);
            
            if(!str.equals("#")){
                Node rightNode = new Node(Integer.parseInt(str));
                node.right = rightNode;
                q.offer(rightNode);
            }
            
        }
        
        return root;
        
    }
    
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        
        inOrder(root);
        
        System.out.println();
        String serialize = serialize(root);
        
        System.out.print(serialize);
        
        System.out.println();
        
        Node node = deserialize(serialize);
        
        inOrder(node);
    }
}
