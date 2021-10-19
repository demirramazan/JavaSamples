package com.javaexamples.hackerrank.thirtydaysofcode;

import java.io.IOException;
import java.util.Scanner;

public class OperatorsSolution {
    /*
    * Task
    Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

    Example



    A tip of 15% * 100 = 15, and the taxes are 8% * 100 = 8. Print the value  and return from the function.

    Function Description
    Complete the solve function in the editor below.

    solve has the following parameters:

    int meal_cost: the cost of food before tip and tax
    int tip_percent: the tip percentage
    int tax_percent: the tax percentage
    Returns The function returns nothing. Print the calculated value, rounded to the nearest integer.

    Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result.
    *
    */
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double result = meal_cost + meal_cost * tip_percent / 100 + meal_cost * tax_percent / 100;
        System.out.println(Math.round(result));
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double meal_cost = scanner.nextDouble();

        int tip_percent = scanner.nextInt();

        int tax_percent = scanner.nextInt();

        OperatorsSolution.solve(meal_cost, tip_percent, tax_percent);

    }
}

