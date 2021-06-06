/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex12.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double principal = myApp.getPrincipal();
        double rate = myApp.getRate();
        double years = myApp.getYears();
        double result = myApp.calc(principal, rate, years);
        myApp.outPut(years, rate, result);
    }

    private void outPut(double years, double rate, double result) {
        System.out.println("After " + String.format("%.0f", years) + " years at " + (rate * 100) + "%, the investment will be worth $" + String.format("%.0f", result) + ".");
    }

    private double calc(double principal, double rate, double years) {
        return Math.ceil((principal * (1 + (rate * years))) * 100) / 100;
    }

    private double getPrincipal() {
        System.out.print("Enter the principal: ");
        return Double.parseDouble(in.nextLine());
    }

    private double getRate() {
        System.out.print("Enter the rate of interest: ");
        return (Double.parseDouble(in.nextLine())) / 100;
    }

    private double getYears() {
        System.out.print("Enter the number of years: ");
        return Double.parseDouble(in.nextLine());
    }

}
