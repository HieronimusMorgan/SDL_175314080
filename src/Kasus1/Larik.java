/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus1;

/**
 *
 * @author basisb06la
 */
public class Larik {

    public static void cetak() {
        int a[] = {80, 85, 75, 90, 100};
        System.out.printf("%-10s", "Index");
        System.out.printf("%-5s\n", "Value");
        System.out.println("==================");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%-10s", i);
            System.out.printf("%-5s\n", a[i]);
        }
    }  
}
