package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedListSolution {

    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return head;
        } else if (head.next == null) {
            head.next = new Node(data);
        } else {
            insert(head.next, data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}