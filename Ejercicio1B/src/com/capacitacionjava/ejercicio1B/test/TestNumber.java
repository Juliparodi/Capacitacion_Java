package com.capacitacionjava.ejercicio1B.test;

import com.capacitacionjava.ejercicio1B.model.Calculator;
import java.util.Random;

public class TestNumber {
    public static void main(String[] args) {

        System.out.println("Welcome to Java calculator program");
        System.out.println("This program has been created to do some random calculations and operations");
        System.out.println("Let's start..." + "\n");
        TestNumber.pressEnterKey();

        //initializing n and n1 with random numbers in a range of [1-10]
        System.out.println("Now, we are going to create 2 random numbers between 1 and 10");
        Random randomNumber = new Random();
        Calculator n = new Calculator(randomNumber.nextInt(10) + 1);
        int n1 = randomNumber.nextInt(10) + 1;
        System.out.println("We'll use:  " + n.getN() + " and " + n1 + "\n");

        //calling and printing methods
        System.out.println("Operations: " + "\n");

        //sum
        System.out.format("Sum of %d and %d is: %d" + "\n", n.getN(), n1, n.Sum(n1));

        //multiply
        System.out.format("result of %d * %d is: %d" + "\n", n.getN(), n1, n.Multiply(n1));

        //isEven
        System.out.println("The number " + n.getN() + " is: " +
                ((n.isEven() == true) ? "even" : "odd"));

        //isPrime
        System.out.println("The number " + n.getN() + " is: " +
                ((n.isPrime() == true) ? "Prime" : "NotPrime"));

        //ConvertToString
        System.out.println("The number " + n.getN() +
                ((n.convertToString() instanceof String) ?  " is string" : "is not string"));

        //ConvertToDouble
        System.out.println("The number " + n.convertToDouble() + " has been converted to double");

        //Calculate Pow
        System.out.format("Pow of " + n.getN() + " to " + n1 + " is: " + n.pow(n1) + "\n");

        //Convert to Base 2
        System.out.println(n.getN() + " converted to Base 2 is: " + n.convertToBase2());

        //Calculate Factorial
        System.out.println("Factorial of " + n.getN() + " is: " + n.Factorial());

        //Calculate CombinatorialNumber
        System.out.format("CombinatorialNumber of " + n.getN() + " and " + n1 + " is: " + n.combinatorialNumber(n.getN(),n1) + "\n");

        System.out.println("Thanks for using Java calculator program. Have a nice day!");


    }

    //method created to make my program more readable.
    public static void pressEnterKey(){
        System.out.println("Press Enter key to continue...");
        try {
            System.in.read();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
