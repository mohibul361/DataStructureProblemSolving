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
public class SubTreeOfAnotherTree {
    
    static boolean ans = false;
    
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
    
    public static boolean match(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        
        if(root != null && subRoot != null){
            
            boolean a = match(root.left, subRoot.left);
            boolean b = match(root.right, subRoot.right);
            
            if((root.data == subRoot.data) 
                    && a && b){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public static void inorder(Node root, Node subRoot){
        if(root != null){
            inorder(root.left, subRoot);
            if(match(root, subRoot)){
                ans = true;
            }
            inorder(root.right, subRoot);
        }
    }
    
    public static boolean isSubtree(Node root, Node subRoot){
        inorder(root, subRoot);
        return ans;
    }
    
    public static void main(String args[]){
        // Creating the main tree
        Node root = new Node(3);
        root.right = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(11);
        root.left.right = new Node(10);

        // Creating the subtree
        Node subRoot = new Node(2);
        subRoot.left = new Node(11);
        subRoot.right = new Node(10);
        
        System.out.println(isSubtree(root, subRoot));
    }
}
