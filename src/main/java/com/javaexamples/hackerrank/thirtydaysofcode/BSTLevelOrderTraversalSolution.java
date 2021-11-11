package com.javaexamples.hackerrank.thirtydaysofcode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node2 {
    Node2 left, right;
    int data;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTLevelOrderTraversalSolution {
    static Queue<Node2> queueNode = new LinkedList<>();

    static void levelOrder(Node2 root) {
        queueNode.add(root);
        while (!queueNode.isEmpty()) {
            Node2 currentNode = queueNode.poll();
            System.out.print(currentNode.data);
            System.out.print(" ");
            if (currentNode.left != null) {
                queueNode.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queueNode.add(currentNode.right);
            }
        }

    }

    public static Node2 insert(Node2 root, int data) {
        if (root == null) {
            return new Node2(data);
        } else {
            Node2 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node2 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}