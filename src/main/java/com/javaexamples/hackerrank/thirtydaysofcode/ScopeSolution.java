package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class ScopeSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}



class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements){
        this.elements=elements;
    }
    // Add your code here
    public void computeDifference(){
        Arrays.sort(this.elements);
        this.maximumDifference = this.elements[this.elements.length-1]- this.elements[0];
    }

} // End of Difference class
