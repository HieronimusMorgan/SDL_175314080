/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus3;

/**
 *
 * @author basisb06la
 */
public class Larik {

    public static void cetak() {
        Mahasiswa[][] Kelas = new Mahasiswa[5][2];
        Kelas[0][0] = new Mahasiswa("John", "234");
        Kelas[0][1] = new Mahasiswa("Rocky", "123");
        Kelas[1][0] = new Mahasiswa("Kelvin", "354");
        Kelas[1][1] = new Mahasiswa("Aldy", "456");
        Kelas[2][0] = new Mahasiswa("Yaska", "578");
        Kelas[2][1] = new Mahasiswa("Beben", "123");
        Kelas[3][0] = new Mahasiswa("Tejo", "234");
        Kelas[3][1] = new Mahasiswa("Yoki", "242");
        Kelas[4][0] = new Mahasiswa("Hiro", "658");
        Kelas[4][1] = new Mahasiswa("Bell", "345");
        System.out.printf("%-15s", "Kelas A");
        System.out.printf("%-15s", "Kelas B");
        System.out.println("");
        System.out.println("---------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.printf("%-15s", Kelas[i][j].getNama() + "," + Kelas[i][j].getNIM());
                System.out.printf("");
            }
            System.out.println("");
        }
    }
}
