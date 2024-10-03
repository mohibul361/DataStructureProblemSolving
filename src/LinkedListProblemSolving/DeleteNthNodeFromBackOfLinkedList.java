  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListProblemSolving;

/**
 *
 * @author user
 */
public class DeleteNthNodeFromBackOfLinkedList {
    
    public static class Node{
        int data;
        Node next;
        
        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    
    public static Node deleteNthNodeFromEnd(Node head, int n){
        Node fastp = head;
        Node slowp = head;
        
        for(int i = 0; i <n; i++){
            fastp = fastp.next;
        }
        
        if(fastp == null){
            return head.next;
        }
        
        while(fastp.next != null){
            slowp = slowp.next;
            fastp = fastp.next;
        }
        
        Node delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }
    
    public static void printLinkedList(Node head){
        
        if(head == null){
            System.out.println("The linked list is empty!");
            return;
        }
        
        Node currNode = head;
        
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        
        System.out.println("NULL");
        
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        
        int n = 5;
        
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        
        printLinkedList(head);
        
        System.out.println("After deleting nth node from linked list is: ");
        head = deleteNthNodeFromEnd(head, n);
        
        printLinkedList(head);
    }
}
