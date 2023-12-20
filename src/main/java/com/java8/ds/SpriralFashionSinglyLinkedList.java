package com.java8.ds;




// Java program for
// Rearrange linked list in spiral order

// Node of Linked List
class LinkNode
{
    public int data;
    public LinkNode next;
    public LinkNode(int data)
    {
        // Set node value
        this.data = data;
        this.next = null;
    }
}
public class SpriralFashionSinglyLinkedList
{
    public LinkNode head;
    public LinkNode tail;
    public LinkNode back;
    public SpriralFashionSinglyLinkedList()
    {
        // Set head and tail
        this.head = null;
        this.tail = null;
        this.back = null;
    }
    // Add new node at the end of linked list
    public void insert(int value)
    {
        // Create a new node
        LinkNode node = new LinkNode(value);
        if (this.head == null)
        {
            this.head = node;
        }
        else
        {
            this.tail.next = node;
        }
        this.tail = node;
    }
    // Display linked list element
    public void display()
    {
        if (this.head == null)
        {
            return;
        }
        LinkNode temp = this.head;
        // iterating linked list elements
        while (temp != null)
        {
            System.out.print(temp.data + " → ");
            // Visit to next node
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void spiralConversion(LinkNode node)
    {
        if (node == null || this.back == null)
        {
            return;
        }
        // Execute until last node
        spiralConversion(node.next);
        if (this.back != null)
        {
            if (this.back == node || this.back.next == node)
            {
                // When we get last node
                this.back = null;
                node.next = null;
                // New last node
                this.tail = node;
                return;
            }
            // Change node link
            node.next = this.back.next;
            this.back.next = node;
            this.back = node.next;
        }
    }
    public void spiralView()
    {
        // Reset Auxiliary variable
        this.back = this.head;
        this.spiralConversion(this.head);
    }
    public static void main(String[] args)
    {
        SpriralFashionSinglyLinkedList sll = new SpriralFashionSinglyLinkedList();
        // Add linked list node
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.insert(5);
        sll.insert(6);
        sll.insert(7);
        // Before effect
        System.out.println("Before spiral conversion");
        // 1 → 2 → 3 → 4 → 5 → 6 → 7 → null
        sll.display();
        // Perform spiral operation
        sll.spiralView();
        // After effect
        System.out.println("After spiral conversion");
        // 1 → 7 → 2 → 6 → 3 → 5 → 4 → null
        sll.display();
    }
}