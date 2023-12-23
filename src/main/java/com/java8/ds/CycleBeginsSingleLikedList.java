package com.java8.ds;

public class CycleBeginsSingleLikedList {
    public static class Node{
        int val;
        Node next;

        public Node (int val){
            this.val =val;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = c;


        Node circleNode  = findCircleNodeValue(a);
        System.out.println("Circle Node value  : " + circleNode.val);

    }

    private static Node findCircleNodeValue(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        Node temp = head;

        while (temp != slow){
            temp = temp.next;
            slow  = slow.next;
        }

        return slow;
    }
}
