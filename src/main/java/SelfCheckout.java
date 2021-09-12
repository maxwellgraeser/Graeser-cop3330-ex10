/*
*  UCF COP3330 Fall 2021 Exercise 10 Solution
*  Copyright 2021 Maxwell Graeser
*/

import java.util.Scanner;
public class SelfCheckout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arrPrice = new double[3];
        int[] arrQuantity = new int[3];
        double subtotal = 0;

        for(int i = 0; i < 3; i++) {
            System.out.print("Enter the price of item " + (i + 1) + ": ");
            arrPrice[i] = scan.nextDouble();
            System.out.print("Enter the quantity of item " + (i + 1) + ": ");
            arrQuantity[i] = scan.nextInt();
        }

        for(int i = 0; i < 3; i++)
            subtotal += arrPrice[i] * arrQuantity[i];
        double tax = subtotal * .055;
        double total = subtotal + tax;

        String output = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
        System.out.println(output);
    }
}