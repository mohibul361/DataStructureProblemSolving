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
public class MergeTwoSortedLinkedList {
    
    public static Node head;
    
    public static class Node{
        int data;
        Node next = null;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node sortTwoLinkedList(Node list1, Node list2){
        
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;
        
        while(list1 != null && list2 != null){
            
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            
            temp = temp.next;
        }
        
        while(list1 != null){
            temp.next = list1;
        }
        
        while(list2 != null){
            temp.next = list2;
        }
        return dummyNode.next;
    }
    
    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("The linked list is empty!");
            return;
        }
        
        Node currNode = head;
        
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    public static void main(String args[]){
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        
        System.out.println("First sorted linked list: " );
        printLinkedList(list1);
        
        System.out.println("Second sorted linked list: ");
        printLinkedList(list2);
        
        Node mergeSortedList = sortTwoLinkedList(list1, list2);
        
        System.out.println("Merge sorted linked list: ");
        printLinkedList(mergeSortedList);
        
    }
}
