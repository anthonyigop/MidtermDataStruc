/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Stack {

     private Node top;
      public Stack() {
        this.top = null;
    }
    boolean isEmpty() {
        return top == null;
    }
       
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }
    
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
    
    class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    
    
    
}
