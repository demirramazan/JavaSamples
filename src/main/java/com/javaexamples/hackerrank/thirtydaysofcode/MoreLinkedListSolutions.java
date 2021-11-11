package com.javaexamples.hackerrank.thirtydaysofcode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;

    Node3(int d) {
        data = d;
        next = null;
    }

}

class MoreLinkedListSolutions {

    public static Node3 removeDuplicates(Node3 head) {
        if(head == null)
            return null;
        Node3 s = head;
        while(s.next != null){
            if(s.data == s.next.data)
                s.next = s.next.next;
            else
                s = s.next;
        }
        return head;
    }

    public static Node3 insert(Node3 head, int data) {
        Node3 p = new Node3(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node3 start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node3 head) {
        Node3 start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node3 head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }
}