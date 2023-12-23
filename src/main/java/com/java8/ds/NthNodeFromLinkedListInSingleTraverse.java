package com.java8.ds;

public class NthNodeFromLinkedListInSingleTraverse {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }


        public static void main(String[] args) {

            Node a = new Node(100); //head
            Node b = new Node(13);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(12);
            Node f = new Node(10);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            Node nthNode = getNthNodefromEndInLinkedListSinglTravers(a, 3);
            System.out.println(nthNode.val);

            Node result = removeNthNodefromEnd(a,6);
            Display(result);
        }

        private static Node getNthNodefromEndInLinkedListSinglTravers(Node a, int n) {
            Node head = a;
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }

            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }

        private static Node removeNthNodefromEnd(Node a, int n) {
            Node head = a;
            Node slow = head;
            Node fast = head;

            for(int i=1; i<=n ; i++){
                fast = fast.next;
            }

            if(fast==null){
                head = head.next;
                return head;
            }
            while (fast.next!=null){
                slow =slow.next;
                fast = fast.next;
            }
            slow.next= slow.next.next;
            return head;
        }

        public static void Display(Node head){
            Node temp = head;
            System.out.println("================ print linkedList =================");
            while(temp!=null){
                System.out.print(temp.val+ " ");
                temp=temp.next;
            }
        }
    }
}
