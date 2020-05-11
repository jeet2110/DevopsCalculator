/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeet.calculator.devopsCalculator;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author jeet
 */
public class Calculator {
    //To Round-off answer upto 4 decimal places.
    public static DecimalFormat df = new DecimalFormat("#.####");

    public static void main(String[] args){
        int ch;
        double a,b;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("-----------------------------------");
            System.out.println("Calculator Program");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("\nEnter your choice : ");

            ch = sc.nextInt();
            if(ch==5)
                break;
            else if(ch>5 || ch<1) {
                System.out.println("Invalid choice");
                continue;
            }
            switch (ch) {
                case 1:
                    System.out.println("Addition");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" + "+ b +" = "+ add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" - "+ b +" = "+ subtract(a, b));
                    break;
                case 3 :
                    System.out.println("Multiplication");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" * "+ b +" = "+ multiply(a,b));
                    break;
                case 4 :
                    System.out.println("Division");
                    System.out.print("Enter 1st number : ");
                    a = sc.nextDouble();
                    System.out.print("Enter 2nd number : ");
                    b = sc.nextDouble();
                    System.out.println(a +" / "+ b +" = "+ divide(a,b));
                    break;
                default:
                    System.out.println("Invalid option");
            }//switch ends
            System.out.println(" ");
        }//while ends
    }

    public static double add(double a, double b) {
        return Double.parseDouble(df.format(a+b));
    }

    public static double subtract(double a, double b) {
        return Double.parseDouble(df.format(a-b));
    }

    /* Feature added later */
    public static double multiply(double a, double b) {
        return Double.parseDouble(df.format(a*b));
    }

    public static double divide(double a, double b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = a/b;
        }
        return Double.parseDouble(df.format(result));
    }
    
}
