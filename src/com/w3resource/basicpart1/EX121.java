package com.w3resource.basicpart1;

/*
Write a Java program to reverse a given linked list.
Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
 */

public class EX121 {
    static Node head;

    static class Node {

        int data;
        Node next_node;

        Node(int d) {
            data = d;
            next_node = null;
        }
    }

    /* Reverse the linked list */
    Node reverse(Node node) {
        Node prev_node = null;
        Node current_node = node;
        Node next_node = null;
        while (current_node != null) {
            next_node = current_node.next_node;
            current_node.next_node = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        node = prev_node;
        return node;
    }

    // Prints the elements of the double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next_node;
        }
    }

    public static void main(String[] args) {
        EX121 list = new EX121();
        list.head = new Node(20);
        list.head.next_node = new Node(40);
        list.head.next_node.next_node = new Node(60);
        list.head.next_node.next_node.next_node = new Node(80);

        System.out.println("Original Linked list:");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed Linked list:");
        list.printList(head);
    }
}
