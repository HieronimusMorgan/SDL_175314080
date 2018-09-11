/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchObject;

import static SearchObject.MainClass2.searchSama;

/**
 *
 * @author asus
 */
public class Coba {

    public static void main(String[] args) {
        Atlet at[] = new Atlet[8];
        at[0] = new Atlet("Sigit", 70);
        at[1] = new Atlet("Purwanto", 80);
        at[2] = new Atlet("Rudi", 75);
        at[3] = new Atlet("Rendra", 90);
        at[4] = new Atlet("Edi", 85);
        at[5] = new Atlet("Gusti", 75);
        at[6] = new Atlet("Bambang", 95);
        at[7] = new Atlet("Agung", 85);

        Atlet otherAtlet = new Atlet("Joko", 75);

        System.out.println("============================");
        System.out.println("Daftar Atlet Angkat Besi");
        System.out.println("============================");
        System.out.printf("%-5s", "No");
        System.out.printf("%-11s", "Nama");
        System.out.printf("%-15s", "Berat Badan");
        System.out.println("");
        System.out.println("---------------------------");
        for (int i = 0; i < at.length; i++) {
            System.out.printf("%-5s", i + 1);
            System.out.printf("%-11s", at[i].getNama());
            System.out.printf("%-15s", at[i].getBeratBadan());
            System.out.println("");
        }
        System.out.println("---------------------------");

        System.out.println("=================");
        System.out.println("Atlet Pembanding");
        System.out.println("=================");
        System.out.printf("%-11s", otherAtlet.getNama());
        System.out.printf("%-15s", otherAtlet.getBeratBadan());
        System.out.println("");
        System.out.println("-----------------");

        System.out.println("===========================");
        System.out.println("Memiliki Berat Sama");
        System.out.println("===========================");
        Atlet result = searchSama(at, otherAtlet);
       
        
        System.out.println("===========================");
        System.out.println("Memiliki Berat Lebih Besar");
        System.out.println("===========================");
        Atlet result1 = searchLebihBesar(at, otherAtlet);
       

        System.out.println("===========================");
        System.out.println("Memiliki Berat Lebih Ringan");
        System.out.println("===========================");
        Atlet result2 = searchLebihKecil(at, otherAtlet);
       
    }

    public static Atlet searchSama(Atlet at[], Atlet a) {
        Atlet result = null;
        for (int i = 0; i < at.length; i++) {
            if (a.compareTo(at[i]) == 0) {
                result = at[i];
                System.out.printf("%-11s", result.getNama());
                System.out.printf("%-15s", result.getBeratBadan());
                System.out.println("");
            }
        }
        return result;
    }

    public static Atlet searchLebihBesar(Atlet at[], Atlet a) {
        Atlet result = null;
        for (int i = 0; i < at.length; i++) {
            if (a.compareTo(at[i]) < 0) {
                result = at[i];
                System.out.printf("%-11s", result.getNama());
                System.out.printf("%-15s", result.getBeratBadan());
                System.out.println("");
            }
        }
        return result;
    }

    public static Atlet searchLebihKecil(Atlet at[], Atlet a) {
        Atlet result = null;
        for (int i = 0; i < at.length; i++) {
            if (a.compareTo(at[i]) > 0) {
                result = at[i];
                System.out.printf("%-11s", result.getNama());
                System.out.printf("%-15s", result.getBeratBadan());
                System.out.println("");
            }
        }
        return result;
    }
}
