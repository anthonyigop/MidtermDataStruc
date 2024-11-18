/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlylinkedlist;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SinglyLinkedList {

    Node head;

    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(data + " inserted at the end of the list.");
    }
    
    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("The linked list has been reversed.");
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

         while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert at End");
            System.out.println("2. Print List");
            System.out.println("3. Reverse List");
            System.out.println("4. Exit");
            System.out.print("Enter a number: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int value = scanner.nextInt();
                    list.insertAtEnd(value);
                    break;
                case 2:
                    list.printList();
                    break;
                case 3:
                    list.reverse();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        }
    }

}
