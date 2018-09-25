/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingObject;

/**
 *
 * @author basisb29
 */
public class Tugas2 {

    public static void main(String[] args) {
        //Membuat array daftarAtlet dengan panjang index 8.
        Atlet daftarAtlet[] = new Atlet[8];
        daftarAtlet[0] = new Atlet("Hong Kong", "To Kenneth", 22.54);
        daftarAtlet[1] = new Atlet("Singapore", "Teong", 22.59);
        daftarAtlet[2] = new Atlet("China", "Yu Hexin", 22.11);
        daftarAtlet[3] = new Atlet("Japan", "Nakamura", 22.20);
        daftarAtlet[4] = new Atlet("Kazakhstan", "Mussin", 22.64);
        daftarAtlet[5] = new Atlet("Japan", "Nakao", 22.46);
        daftarAtlet[6] = new Atlet("Taipei", "Lin", 22.67);
        daftarAtlet[7] = new Atlet("India", "Khade", 22.47);

        System.out.println("====================================");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-6s", "Waktu");
        System.out.println("");
        System.out.println("====================================");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.printf("%-15s", daftarAtlet[i].getNegara());
            System.out.printf("%-15s", daftarAtlet[i].getNama());
            System.out.printf("%.2f", daftarAtlet[i].getWaktu());
            System.out.println("");
        }

        System.out.println("\n");
        System.out.println("Sorting Bubble Sort Ascending");
        System.out.println("====================================");
        BubbleSortAscending(daftarAtlet);
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-6s", "Waktu");
        System.out.println("");
        System.out.println("====================================");
        for (int i = 0; i < daftarAtlet.length; i++) {
            System.out.printf("%-15s", daftarAtlet[i].getNegara());
            System.out.printf("%-15s", daftarAtlet[i].getNama());
            System.out.printf("%.2f", daftarAtlet[i].getWaktu());
            System.out.println("");
        }
    }

    public static Atlet[] BubbleSortAscending(Atlet nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length - 1; j++) {
                if (nilai[j + 1].compareTo(nilai[j]) < 0) {
                    Atlet swap = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = swap;
                }
            }
        }
        return nilai;
    }

    public static Atlet[] BubbleSortDescending(Atlet nilai[]) {
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai.length - 1; j++) {
                if (nilai[j + 1].compareTo(nilai[j]) > 0) {
                    Atlet swap = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = swap;
                }
            }
        }
        return nilai;
    }

    public static Atlet[] SelectionSortAscending(Atlet[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Atlet swap = a[min];
                a[min] = a[i];
                a[i] = swap;
            }
        }
        return a;
    }

    public static Atlet[] SelectionSortDescending(Atlet[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                Atlet swap = a[min];
                a[min] = a[i];
                a[i] = swap;
            }
        }
        return a;
    }

    public static Atlet[] InsertionSortAscending(Atlet mahasiswa[]) {
        int holePosition;
        for (int i = 1; i < mahasiswa.length; i++) {
            Atlet valueToInsert = mahasiswa[i];
            holePosition = i;
            while (holePosition > 0
                    && mahasiswa[holePosition - 1].compareTo(valueToInsert) < 0) {
                mahasiswa[holePosition] = mahasiswa[holePosition - 1];
                holePosition = holePosition - 1;
            }
            mahasiswa[holePosition] = valueToInsert;
        }
        return mahasiswa;
    }

    public static Atlet[] InsertionSortDescending(Atlet atlet[]) {
        int holePosition;
        for (int i = 1; i < atlet.length; i++) {
            Atlet valueToInsert = atlet[i];
            holePosition = i;
            while (holePosition > 0
                    && atlet[holePosition - 1].compareTo(valueToInsert) > 0) {
                atlet[holePosition] = atlet[holePosition - 1];
                holePosition = holePosition - 1;
            }
            atlet[holePosition] = valueToInsert;
        }
        return atlet;
    }
}
