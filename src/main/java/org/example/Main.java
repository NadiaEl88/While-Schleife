package org.example;

public class Main {

    public static long fibonacciRek(int n) {

        if(n <= 0) {
        return 0;
    }
        if(n <= 1) {
            return n;
    } else {
            return fibonacciRek(n-1) + fibonacciRek (n-2);
        }
    }



    public static void main(String[] args) {
        System.out.println("Eine Zahl in der Fibonacci Reihe lautet: "+fibonacciRek(9));
    }
}




