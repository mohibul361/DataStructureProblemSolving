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
public class KthLargestAndSmallest {
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
    
    private static void reverseInorder(Node root, int counter[], int k, int kLargest[]){
        if(root == null || counter[0] >= k){
            return;
        }
        
        reverseInorder(root.right, counter, k, kLargest);
        
        counter[0]++;
        
        if(counter[0] == k){
            kLargest[0] = root.data;
            return;
        }
        
        reverseInorder(root.left, counter, k, kLargest);
    }
    
    private static void inorder(Node root, int counter[], int k, int kSmallest[]){
        if(root == null || counter[0] >= k){
            return;
        }
        
        inorder(root.left, counter, k, kSmallest);
        
        counter[0]++;
        
        if(counter[0] == k){
            kSmallest[0] = root.data;
            return;
        }
        
        inorder(root.right, counter, k, kSmallest);
    }
    
    public static int[] findKth(Node root, int k){
        int kSmallest[] = new int[]{Integer.MIN_VALUE};
        int kLargest[] = new int[]{Integer.MAX_VALUE};
        
        int counter[] = new int[]{0};
        
        inorder(root, counter, k, kSmallest);
        
        counter[0] = 0;
        
        reverseInorder(root, counter, k, kLargest);
        
        return new int[]{kSmallest[0], kLargest[0]};
    }
    
    public static void printBST(Node root){
        if(root == null){
            return;
        }
        
        printBST(root.left);
        System.out.print(root.data + " ");
        printBST(root.right);
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(13);
        root.left.left = new Node(3);
        root.left.left.left = new Node(2);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.left.right.right = new Node(9);
        root.right.left = new Node(11);
        root.right.right = new Node(14);
        
        System.out.println("The order binary tree is: ");
        printBST(root);
        
        int[] kthElement = findKth(root, 3);
        
        System.out.println();
        
        System.out.println("The kth smallest element: " + kthElement[0]);
        System.out.println("The kth largest element:  " + kthElement[1]);
    }
}
