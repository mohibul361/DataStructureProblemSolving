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
public class LCAinBST {
    
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
    
    public static Node lca(Node root, int n1, int n2){
        while(root != null){

            if (root.data > n1 && root.data > n2) {
                root = root.left;
            } else if (root.data < n1 && root.data < n2) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
    
    public static void main(String args[]){
        
        Node node = new Node(20);
        node.left = new Node(8);
        node.right = new Node(22);
        node.left.left = new Node(4);
        node.left.right = new Node(12);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(14);
        
        Node lca = lca(node, 8, 14);
        
        System.out.println("lca : " + lca.data);
    }
}
