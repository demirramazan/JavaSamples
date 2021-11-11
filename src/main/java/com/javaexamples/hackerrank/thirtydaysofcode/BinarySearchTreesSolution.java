package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

class Node1 {
    Node1 left, right;
    int data;

    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTreesSolution {

    public static int getHeight(Node1 root) {
        int leftNodeCount = 0, rightNodeCount = 0;
        if (root == null) {
            return -1;
        } else {
            if (root.left != null)
                leftNodeCount = getHeight(root.left) + 1;
            if (root.right != null)
                rightNodeCount = getHeight(root.right) + 1;
        }
        return Math.max(leftNodeCount, rightNodeCount);
    }

    public static Node1 insert(Node1 root, int data) {
        if (root == null) {
            return new Node1(data);
        } else {
            Node1 cur;
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
        Node1 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}