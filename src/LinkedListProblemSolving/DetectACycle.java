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
public class DetectACycle {

    public static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean cycleDetected(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    
    public static Node findStartingPoint(Node head){
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    
    public static void removeCycle(Node head){
        Node startingPoint = findStartingPoint(head);
        
        if(startingPoint == null){
            return;
        }
        
        Node current = startingPoint;
        
        while(current.next != startingPoint){
            current = current.next;
        }
        current.next = null;
    }
    
    public static void printList(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty!");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create a cycle
        fifth.next = third;

        if (cycleDetected(head)) {
            System.out.println("Cycle is detected!");
            removeCycle(head); // Remove the cycle
            System.out.println("Cycle removed.");
        } else {
            System.out.println("Cycle is not detected");
        }

        printList(head); // Print the list after removing the cycle
    }
}