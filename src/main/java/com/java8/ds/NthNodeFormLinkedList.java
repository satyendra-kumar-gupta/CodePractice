package com.java8.ds;

public class NthNodeFormLinkedList {

    public static class Node{
        int val;
        Node next;

        public Node (int val){
            this.val =val;
        }

        public static void main(String[] args) {
            Node a = new Node(100); //head
            Node b = new Node(13);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(12);
            Node f = new Node(10);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;

            Node nthNode = getNthNodefromEndInLinkedList(a,3 );
            System.out.println(nthNode.val);



        }



        private static Node getNthNodefromEndInLinkedList(Node head, int n) {
            int size = 0;
            Node temp = head;
            while (temp != null){
                size++;
                temp = temp.next;
            }

            int m = size -n+1;
            temp = head;
            for(int i=0; i<m-1; i++){
                temp = temp.next;
            }
            return  temp;
        }
    }
}
