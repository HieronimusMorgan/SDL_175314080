/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonacci;

/**
 *
 * @author asus
 */
public class TestFibonacci {

    public static void main(String[] args) {
        int number = 7;
        for (int i = 1; i <= number; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println("");
    }

    public static int fibo(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
