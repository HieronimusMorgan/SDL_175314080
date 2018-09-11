/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchObject;

/**
 *
 * @author basisb29
 */
public class MainClass2 {

    public static void main(String[] args) {
        //Membuat array daftarAtlet dengan panjang index 8.
        Atlet daftarAtlet[] = new Atlet[8];
        daftarAtlet[0] = new Atlet("Sigit", 70);
        daftarAtlet[1] = new Atlet("Purwanto", 80);
        daftarAtlet[2] = new Atlet("Rudi", 75);
        daftarAtlet[3] = new Atlet("Rendra", 90);
        daftarAtlet[4] = new Atlet("Edi", 85);
        daftarAtlet[5] = new Atlet("Gusti", 75);
        daftarAtlet[6] = new Atlet("Bambang", 95);
        daftarAtlet[7] = new Atlet("Agung", 85);

        //Membuat Array otherAtlet
        Atlet otherAtlet = new Atlet("Joko", 75);

        //Tampilan Daftar Atlet
        System.out.println("============================");
        System.out.println("Daftar Atlet Angkat Besi");
        System.out.println("============================");
        System.out.printf("%-5s", "No");
        System.out.printf("%-11s", "Nama");
        System.out.printf("%-15s", "Berat Badan");
        System.out.println("");
        System.out.println("---------------------------");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.printf("%-5s", i + 1);
            System.out.printf("%-11s", daftarAtlet[i].getNama());
            System.out.printf("%-15s", daftarAtlet[i].getBeratBadan());
            System.out.println("");
        }
        System.out.println("");
        //Atlet Pembanding
        System.out.println("=================");
        System.out.println("Atlet Pembanding");
        System.out.println("=================");
        System.out.printf("%-11s", otherAtlet.getNama());
        System.out.printf("%-15s", otherAtlet.getBeratBadan());
        System.out.println("\n");

        //Memiliki Berat Yang Sama
        System.out.println("===========================");
        System.out.println("Memiliki Berat Sama");
        System.out.println("===========================");
        Atlet beratSama[] = searchSama(daftarAtlet, otherAtlet);
        for (int i = 0; i < beratSama.length; i++) {
            if (beratSama[i] != null) {
                System.out.printf("%-11s", beratSama[i].getNama());
                System.out.printf("%-15s", beratSama[i].getBeratBadan());
                System.out.println("");
            }
        }
        System.out.println("");

        //Memiliki Berat Yang Lebih Besar
        System.out.println("===========================");
        System.out.println("Memiliki Berat Lebih Besar");
        System.out.println("===========================");
        Atlet lebihBesar[] = searchLebihBesar(daftarAtlet, otherAtlet);
        for (int i = 0; i < lebihBesar.length; i++) {
            if (lebihBesar[i] != null) {
                System.out.printf("%-11s", lebihBesar[i].getNama());
                System.out.printf("%-15s", lebihBesar[i].getBeratBadan());
                System.out.println("");
            }
        }
        System.out.println("");
        //Memiliki Berat yang Lebih Ringan
        System.out.println("===========================");
        System.out.println("Memiliki Berat Lebih Ringan");
        System.out.println("===========================");
        Atlet lebihRingan[] = searchLebihKecil(daftarAtlet, otherAtlet);
        for (int i = 0; i < lebihRingan.length; i++) {
            if (lebihRingan[i] != null) {
                System.out.printf("%-11s", lebihRingan[i].getNama());
                System.out.printf("%-15s", lebihRingan[i].getBeratBadan());
                System.out.println("");
            }
        }
    }

    /**
     * searchSama digunakan untuk mencari daftarAtlet yang sama dengan
     * otherAtlet dengan membuat method array yang digunakan untuk menyimpan
     * data yang sama antara daftarAtlet dengan otherAtlet
     *
     * @param daftarAtlet
     * @param otherAtlet
     * @return
     */
    public static Atlet[] searchSama(Atlet daftarAtlet[], Atlet otherAtlet) {
        Atlet result[] = new Atlet[daftarAtlet.length];
        for (int i = 0; i < result.length; i++) {
            //melakukan perbandingan antara otherAtlet dengan daftarAtlet 
            //jika == 0 maka result [i] = daftarAtlet[i]
            if (otherAtlet.compareTo(daftarAtlet[i]) == 0) {
                result[i] = daftarAtlet[i];
            }
        }
        //pengembalian result kepada method searchSama
        return result;
    }

    /**
     * searchLebihBesar digunakan untuk mencari daftarAtlet yang lebih besar
     * dari otherAtlet dengan membuat method array yang digunakan untuk
     * menyimpan data yang lebih besar antara daftarAtlet dengan otherAtlet
     *
     * @param daftarAtlet
     * @param otherAtlet
     * @return
     */
    public static Atlet[] searchLebihBesar(Atlet daftarAtlet[], Atlet otherAtlet) {
        Atlet result[] = new Atlet[daftarAtlet.length];
        for (int i = 0; i < result.length; i++) {
            //melakukan perbandingan antara otherAtlet dengan daftarAtlet 
            //jika < 0 maka result [i] = daftarAtlet[i]
            if (otherAtlet.compareTo(daftarAtlet[i]) < 0) {
                result[i] = daftarAtlet[i];
            }
        }
        //pengembalian result kepada method searchLebihBesar
        return result;
    }

    /**
     * searchLebihBesar digunakan untuk mencari daftarAtlet yang lebih ringan
     * dari otherAtlet dengan membuat method array yang digunakan untuk
     * menyimpan data yang lebih ringan antara daftarAtlet dengan otherAtlet
     *
     * @param daftarAtlet
     * @param otherAtlet
     * @return
     */
    public static Atlet[] searchLebihKecil(Atlet daftarAtlet[], Atlet otherAtlet) {
        Atlet result[] = new Atlet[daftarAtlet.length];
        for (int i = 0; i < daftarAtlet.length; i++) {
            //melakukan perbandingan antara otherAtlet dengan daftarAtlet 
            //jika > 0 maka result [i] = daftarAtlet[i]
            if (otherAtlet.compareTo(daftarAtlet[i]) > 0) {
                result[i] = daftarAtlet[i];
            }
        }
        //pengembalian result kepada method searchLebihKecil
        return result;
    }
}
