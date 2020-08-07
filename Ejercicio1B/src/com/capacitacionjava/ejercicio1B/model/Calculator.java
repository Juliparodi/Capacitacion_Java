package com.capacitacionjava.ejercicio1B.model;

public class Calculator {
    private int n;

    public Calculator(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    //Sum
     public int Sum (int n1){
        return n + n1;
     }

    //Multiply
    public int Multiply (int n1){
        return n * n1;
    }

    //is it even?
    public boolean isEven(){
        return (n % 2 == 1) ? false : true;
    }

    // @Param counter starts with 2 since any int number mod 1 will be 0
    // method to calculate if n is prime using while loop.
    public boolean isPrime(){
        int counter = 2;
        boolean prime=true;
        while ((prime) && (counter!=n)){
            if (n % counter == 0) {prime = false;}
            counter++;
        }
        return prime;
    }

    //convert to string
    public String convertToString(){
        return String.valueOf(n);
    }

    //convert to double
    public double convertToDouble() {
        return Double.parseDouble(String.valueOf(n));
    }

    //Calculate Pow
    public double pow(int n1){
        return  Math.pow(n, n1);
    }

    //Convert to base 2
    public String convertToBase2(){
        return Integer.toString(n,2);
    }

    //Calculate factorial with for loop
    public int Factorial(){
        int factorial = 1;
        if(n<1) return 1;
        for(int i = 1; i<=n ;i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    //combinatorialNumber using recursion
    public int combinatorialNumber(int n, int n1){
        if( n1 == 0 || n1 == n)
            return 1;
        if( n1 > n)
            return 0;
        int a , b;
        a = combinatorialNumber (n - 1 , n1 -1 );
        b = combinatorialNumber ( n - 1 , n1 );
        return a + b;
    }
}
