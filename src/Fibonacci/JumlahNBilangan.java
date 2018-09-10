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
public class JumlahNBilangan {

    public static void main(String[] args) {
        System.out.println(JumlahN(10));
        System.out.println(JumlahNBiasa(10));
    }

    public static int JumlahN(int n) {
        if (n > 0) {
            return n + JumlahN(n - 1);
        } else {
            return 0;
        }
    }

    public static int JumlahNBiasa(int n) {
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        return jumlah;
    }
}
