package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class InheritanceSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}


class Person1 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person1(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person1 {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        int avarage = this.calculateAvarage();
        if (avarage >= 90 && avarage <= 100) {
            return "O";
        } else if (avarage >= 80 && avarage < 90) {
            return "E";
        } else if (avarage >= 70 && avarage < 80) {
            return "A";
        } else if (avarage >= 55 && avarage < 70) {
            return "P";
        } else if (avarage >= 40 && avarage < 55) {
            return "D";
        } else {
            return "T";
        }
    }

    public int calculateAvarage() {
        int sum = 0;
        for (int i : testScores) {
            sum += i;
        }
        return sum / testScores.length;
    }

}

