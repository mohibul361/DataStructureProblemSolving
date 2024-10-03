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
public class ReversedLinkedList {
    
    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        public Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    
    public static Node reverseLinkedListUsingStack(Node head){
        
        Node temp = head;
        Node prev = null;
        
        while(temp != null){
            Node front = temp.next;
            
            temp.next = prev;
            prev = temp;
            temp =front;
        }
        return prev;
    }
    
    public static void printList(Node head){
        
        if(head == null){
            System.out.println("The linked list is empty!");
            return;
        }
        
        Node currNode = head;
        
        while(currNode != null){
            System.out.print(currNode.data + " ->");
            currNode = currNode.next;
        }
        
        System.out.println("NULL");
    }
    
    
    public static void main(String args[]){
        
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        
        System.out.println("The original linked list is: ");
        printList(head);
        
        head = reverseLinkedListUsingStack(head);
        
        System.out.println("Reversed linked list is:  ");
        
        printList(head);
        
        
    }
}
