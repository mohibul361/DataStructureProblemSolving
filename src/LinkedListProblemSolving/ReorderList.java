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
public class ReorderList {
    
    static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node middle(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static Node reverse(Node head){
        
        Node curr = head;
        Node prev = null;
        Node forw = null;
        
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        
        return prev;
    }
    
    public static void reOrderList(Node head){
        if(head == null || head.next == null){
            return;
        }
        
        Node mid = middle(head);
        Node rev = reverse(mid.next);
        mid.next = null;
        
        Node c1 = head;
        Node c2 = rev;
        Node f1 = null;
        Node f2 = null;
        
        while(c1 != null && c2 != null){
            f1 = c1.next;
            f2 = c2.next;
            
            c1.next = c2;
            c2.next = f1;
            
            c1 = f1;
            c2 = f2;

        }
    }
    
     public static void printLinkedList(Node head){
         if(head == null){
             System.out.println("Linked list is empty!");
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
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        
        printLinkedList(head);
        
        System.out.println("After reorder: ");
        
        reOrderList(head);
        
        printLinkedList(head);
    }
}
