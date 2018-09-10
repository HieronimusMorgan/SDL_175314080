/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus2;

/**
 *
 * @author basisb06la
 */
public class Larik {

    public static void cetak() {
        Mahasiswa mahasiswa[] = new Mahasiswa[5];

        mahasiswa[0] = new Mahasiswa("John", "234");
        mahasiswa[1] = new Mahasiswa("Rocky", "123");
        mahasiswa[2] = new Mahasiswa("Kelvin", "354");
        mahasiswa[3] = new Mahasiswa("Aldy", "456");
        mahasiswa[4] = new Mahasiswa("Yaska", "578");

        System.out.printf("%-10s", "index");
        System.out.printf("%-10s", "Nama");
        System.out.printf("%-10s", "Nim");
        System.out.println("");
        System.out.println("---------------------------");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.printf("%-10s", i);
            System.out.printf("%-10s", mahasiswa[i].getNama());
            System.out.printf("%-10s", mahasiswa[i].getNIM());
            System.out.println("");
        }
    }

}
