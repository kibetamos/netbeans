/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author manu
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        int num1;
        int num2;
        String operation;


        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        System.out.println("please enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation");
        operation = op.next();

        if ("+".equals(operation));
        {
            System.out.println("your answer is" + (num1 + num2));
        }
        if  ("-".equals(operation));
        {
            System.out.println("your answer is" + (num1 - num2));
        }

        if ("/".equals(operation));
        {
            System.out.println("your answer is" + (num1 / num2));
        }
        if ("*".equals(operation))
        {
            System.out.println("your answer is" + (num1 * num2));
        }


    }
}